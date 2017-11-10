package models.domain;


import javax.persistence.*;

@Entity
public class Alunno{

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    int id;
    String nome;
    String cognome;
    @OneToOne
    AreaRiferimento areaRiferimento;

 /*   public Alunno(int id,String nome,String cognome,AreaRiferimento areaRiferimento){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.areaRiferimento = areaRiferimento;
    }*/

    @javax.persistence.Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}