package Controleur;

import Model.Commentaire;
import Model.Joueur;
import Model.Repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Commentaire")
public class CommentaireControleur {
    @Autowired

    private CommentaireRepository commentaireRepository;

    @PostMapping
    public String AddCommentaire(@RequestParam Commentaire commentaire) {
        Commentaire c = commentaireRepository.save(commentaire);
        return "Ajouté";
    }

    @GetMapping(path = "/id")
    public Commentaire GetCommentaire(@RequestParam int id) {
        return commentaireRepository.findById(id).get();
    }

    @GetMapping
    public @ResponseBody Iterable<Commentaire> ListCommentaire() {
        return commentaireRepository.findAll();

    }

    @DeleteMapping
    public String DeleteCommentaire(@RequestParam int id) {
        commentaireRepository.deleteById(id);
        return "Commentaire Supprimé";
    }

    @PutMapping
    public String UpdateCommentaire(@RequestParam int id, @RequestParam Commentaire c) {
        commentaireRepository.save(c);
        return "Mise à jour effectuée";
    }
}
