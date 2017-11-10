package models.repository;

import models.DatabaseExecutionContext;
import models.domain.Person;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class JPAPersonRepository implements PersonRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAPersonRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Person> add(Person person) {
        return supplyAsync(() -> wrap(em -> insert(em, person)), executionContext);
    }

    @Override
    public List<Person> personList(String query) {
        return (List<Person>) wrap(em -> list(em,query)).collect(Collectors.toList());
    }

    @Override
    public CompletionStage<?> fetch() {
        return null;
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Person insert(EntityManager em, Person person) {
        em.persist(person);
        return person;
    }

    private Stream<?> list(EntityManager em,String query) {
        List<Person> persons = em.createQuery(query, Person.class).getResultList();
        return persons.stream();
    }
}
