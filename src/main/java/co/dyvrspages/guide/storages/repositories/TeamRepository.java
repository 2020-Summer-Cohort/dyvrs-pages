package co.dyvrspages.guide.storages.repositories;

import co.dyvrspages.guide.entities.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {
    public Team findByName(String name);
}
