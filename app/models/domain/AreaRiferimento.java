package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AreaRiferimento {

    @Id
    int id;
    String descrizione;

//    public AreaRiferimento(int id,String descrizione){
//        this.id = id;
//        this.descrizione = descrizione;
//    }
    @javax.persistence.Id
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