package co.dyvrspages.guide.storages;


import co.dyvrspages.guide.entities.Team;
import co.dyvrspages.guide.storages.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeamStorage {
    private final TeamRepository teamRepo;

    public TeamStorage(TeamRepository teamRepo) {
        this.teamRepo = teamRepo;
    }

    public TeamRepository getTeamRepo() {
        return teamRepo;
    }

    public Collection<Team> findAll() {
        return (Collection<Team>) teamRepo.findAll();
    }

    public Team findById(Long id) {
        return teamRepo.findById(id).get();
    }
}
