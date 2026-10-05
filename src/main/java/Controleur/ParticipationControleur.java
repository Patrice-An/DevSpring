package Controleur;

import Model.Participation;
import Model.Repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/Participation")
public class ParticipationControleur {
    @Autowired

    private ParticipationRepository participationRepository;

    @PostMapping
    public String addParticipation(Participation participation) {
        participationRepository.save(participation);
        return "Ajouté";
    }

    @GetMapping(path = "/id")
    public Participation getParticipation(@RequestParam int idParticipation) {
        return participationRepository.findById(idParticipation).get();
    }

    @GetMapping
    public Iterable<Participation> getParticipations() {
        return participationRepository.findAll();
    }

    @DeleteMapping
    public Participation deleteParticipation(@RequestParam int idParticipation) {
        Participation participation = participationRepository.findById(idParticipation).get();
        participationRepository.delete(participation);
        return participation;
    }


}
