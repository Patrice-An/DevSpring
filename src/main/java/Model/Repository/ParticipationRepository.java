package Model.Repository;


import Model.Participation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepository  extends CrudRepository<Participation, Integer> {





}
