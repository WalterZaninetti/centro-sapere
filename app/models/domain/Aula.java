package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aula {

    @Id
    int id;
    String descrizione;
    int capienza;

//    public Aula(int id,String descrizione,int capienza){
//        this.id = id;
//        this.descrizione = descrizione;
//        this.capienza = capienza;
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

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }
}