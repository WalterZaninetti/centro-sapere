package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materia {
    @Id
    int id;
    String descrizione;

//    public Materia(int id, String descrizione){
//        this.id = id;
//        this.descrizione = descrizione;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}