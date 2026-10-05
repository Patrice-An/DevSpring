package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.Nullable;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Nullable Integer CommentaireId;

    private String contenu;

    private String String;

    public @Nullable Integer getCommentaireId() {
        return CommentaireId;
    }

    public void setCommentaireId(@Nullable Integer commentaireId) {
        CommentaireId = commentaireId;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getString() {
        return String;
    }

    public void setString(String string) {
        String = string;
    }
}
