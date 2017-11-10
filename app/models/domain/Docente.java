package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Docente{
    @Id
    int id;
    String nome;
    float percentuale;

    @OneToOne(optional=false)
    Materia materia;

//    public Docente(int id,String nome,int percentuale,Materia materia){
//        this.id= id;
//        this.nome = nome;
//        this.percentuale = percentuale;
//        this.materia = materia;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(float percentuale) {
        this.percentuale = percentuale;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}