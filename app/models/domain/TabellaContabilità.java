package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TabellaContabilità{
    @Id
    int id;
    @OneToOne
    Docente docente;
    float oreMensili;
    float resa;
    float compenso;
    String altro; //TODO Capire meglio
    float totale;
    float trattenute;
    float netto;

//    public TabellaContabilità(Docente docente, float oreMensili, float resa, float compenso, String altro, float totale, float trattenute, float netto) {
//        this.docente = docente;
//        this.oreMensili = oreMensili;
//        this.resa = resa;
//        this.compenso = compenso;
//        this.altro = altro;
//        this.totale = totale;
//        this.trattenute = trattenute;
//        this.netto = netto;
//    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public float getOreMensili() {
        return oreMensili;
    }

    public void setOreMensili(float oreMensili) {
        this.oreMensili = oreMensili;
    }

    public float getResa() {
        return resa;
    }

    public void setResa(float resa) {
        this.resa = resa;
    }

    public float getCompenso() {
        return compenso;
    }

    public void setCompenso(float compenso) {
        this.compenso = compenso;
    }

    public String getAltro() {
        return altro;
    }

    public void setAltro(String altro) {
        this.altro = altro;
    }

    public float getTotale() {
        return totale;
    }

    public void setTotale(float totale) {
        this.totale = totale;
    }

    public float getTrattenute() {
        return trattenute;
    }

    public void setTrattenute(float trattenute) {
        this.trattenute = trattenute;
    }

    public float getNetto() {
        return netto;
    }

    public void setNetto(float netto) {
        this.netto = netto;
    }
}