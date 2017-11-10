package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Registro{
    @Id
    int id;
    String note;
    @OneToMany
    List<Alunno> alunniPresenti;

//    public Registro(int id,String note,List<Alunno> alunniPresenti){
//        this.id = id;
//        this.note = note;
//        this.alunniPresenti = alunniPresenti;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Alunno> getAlunniPresenti() {
        return alunniPresenti;
    }

    public void setAlunniPresenti(List<Alunno> alunniPresenti) {
        this.alunniPresenti = alunniPresenti;
    }
}