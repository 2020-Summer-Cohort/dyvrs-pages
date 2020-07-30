package co.dyvrspages.guide.repositories;

import co.dyvrspages.guide.entities.TeamPage;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<TeamPage, Long> {
}
