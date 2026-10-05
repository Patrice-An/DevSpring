package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.Nullable;

@Entity
public class Joueur {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private @Nullable Integer JoueurId;

    private String nom;

    private String prenom;

    private String nLicence;

    private Float taille;

    private Float poids;

    private String status;

    public @Nullable Integer getJoueurId(){
        return JoueurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNLicence() {
        return nLicence;
    }

    public void setNLicence(String n_licence) {
        this.nLicence = n_licence;
    }

    public Float getTaille() {
        return taille;
    }

    public void setTaille(Float taille) {
        this.taille = taille;
    }

    public Float getPoids() {
        return poids;
    }

    public void setPoids(Float poids) {
        this.poids = poids;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
