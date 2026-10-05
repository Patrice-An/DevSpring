package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.Nullable;

@Entity
public class Rencontre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Nullable Integer rencontreId;

    private String dateHeure;
    private String equipeAdverse;
    private String adresse;
    private String lieu;
    private String resultat;

    public @Nullable Integer getRencontreId() {
        return rencontreId;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEquipeAdverse() {
        return equipeAdverse;
    }

    public void setEquipeAdverse(String equipeAdverse) {
        this.equipeAdverse = equipeAdverse;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}
