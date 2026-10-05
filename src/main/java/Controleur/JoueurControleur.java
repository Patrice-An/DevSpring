package Controleur;

import Model.Joueur;
import Model.Repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/Joueur")
public class JoueurControleur {
    @Autowired

    private JoueurRepository joueurRepository;

    @PostMapping
    public String addJoueur(@RequestParam Joueur joueur) {
        Joueur j = joueurRepository.save(joueur);
        return "Ajouté";
    }

    @GetMapping(path = "/id")
    public Joueur getJoueur(@RequestParam int id) {
        return joueurRepository.findById(id).get();
    }

    @GetMapping
    public @ResponseBody Iterable<Joueur> ListJoueurs() {
        return joueurRepository.findAll();

    }

    @DeleteMapping
    public String deleteJoueur(@RequestParam int id) {
        joueurRepository.deleteById(id);
        return "Joueur Supprimé";
    }

    @PutMapping
    public String updateJoueur(@RequestParam int id, @RequestParam Joueur j) {
        joueurRepository.save(j);
        return "Mise à jour effectuée";
    }
}
