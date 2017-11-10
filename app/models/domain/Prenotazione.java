package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Prenotazione {
    @Id
    int id;
    @OneToOne
    Docente docente;
    @OneToOne
    Aula aula;
    Date data;
    int surplus;
    boolean isDefault;

//    public Prenotazione(int id,Docente docente,Aula aula,Date data,int surplus,boolean isDefault){
//        this.id = id;
//        this.docente = docente;
//        this.aula = aula;
//        this.data = data;
//        this.surplus = surplus;
//        this.isDefault = isDefault;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getSurplus() {
        return surplus;
    }

    public void setSurplus(int surplus) {
        this.surplus = surplus;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}