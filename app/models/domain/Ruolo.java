package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ruolo {
    @Id
    int codice;
    String descrizione;

//    public Ruolo(int codice, String descrizione) {
//        this.codice = codice;
//        this.descrizione = descrizione;
//    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
