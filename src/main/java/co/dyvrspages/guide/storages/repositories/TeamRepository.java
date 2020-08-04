package co.dyvrspages.guide.storages.repositories;

import co.dyvrspages.guide.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
