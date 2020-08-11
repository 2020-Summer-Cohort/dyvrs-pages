package co.dyvrspages.guide.controllers;


import co.dyvrspages.guide.entities.Team;
import co.dyvrspages.guide.storages.TeamStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TeamController {
    private TeamStorage teamStorage;

    public TeamController(TeamStorage teamStorage) {
        this.teamStorage = teamStorage;
    }

    public TeamStorage getTeamStorage() {
        return teamStorage;
    }

    @GetMapping("/api/team/")
    public Collection<Team> findAllTeamMembers(){
        return teamStorage.findAll();
    }
    @GetMapping("/api/team/{id}")
    public Team findById(@PathVariable long id){
        return teamStorage.findById(id);
    }

    @GetMapping("/api/teams/{name}/")
    public Team findById(@PathVariable String name){
        return teamStorage.findByName(name);}
}
