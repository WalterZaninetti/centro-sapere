package models.repository;

import com.google.inject.ImplementedBy;
import models.domain.Person;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPAPersonRepository.class)
public interface PersonRepository {

    CompletionStage<Person> add(Person person);

    List<Person> personList(String query);

    CompletionStage<?> fetch();
}
