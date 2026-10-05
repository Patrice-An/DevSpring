package Controleur;

import Model.Participation;
import Model.Repository.JoueurRepository;
import Model.Repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Rencontre")
public class RencontreControleur {
    @Autowired
    private ParticipationRepository participationRepository;

    @GetMapping
    public Iterable<Participation> getParticipations() {
        return participationRepository.findAll();
    }

    @GetMapping(path = "/id")
    public Participation getParticipation(@RequestParam int id) {
        return participationRepository.findById(id).get();
    }

    @PostMapping
    public String addParticipation(@RequestBody Participation participation) {
        Participation p = participationRepository.save(participation);
        return "ajouté";
    }

    @PutMapping
    public String updateParticipation(@RequestBody Participation participation) {
        Participation p = participationRepository.save(participation);
        return "Mise à Jour effectuée";
    }

    @DeleteMapping
    public void deleteParticipation(@RequestParam int id) {
        participationRepository.deleteById(id);
    }


}
