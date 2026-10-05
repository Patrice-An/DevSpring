package Model.Repository;


import Model.Rencontre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RencontreRepository  extends CrudRepository<Rencontre, Integer> {
}
