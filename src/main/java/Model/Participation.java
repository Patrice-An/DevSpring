package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.Nullable;

@Entity
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Nullable Integer ParticipationId;

    private Boolean titulaire;

    private String poste;

    private Integer note;

    public @Nullable Integer getParticipationId() {
        return ParticipationId;
    }

    public void setParticipationId(@Nullable Integer participationId) {
        ParticipationId = participationId;
    }

    public Boolean getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Boolean titulaire) {
        this.titulaire = titulaire;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
