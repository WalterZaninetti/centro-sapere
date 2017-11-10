package models.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Utenti{
    @Id
    int id;
    String nickname;
    String password;
    @OneToOne
    Ruolo ruolo;

//    public Utenti(int id,String nickname,String password,Ruolo ruolo){
//        this.id = id;
//        this.nickname = nickname;
//        this.password = password;
//        this.ruolo = ruolo;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }
}