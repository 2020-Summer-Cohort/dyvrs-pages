package co.dyvrspages.guide;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TeamPage {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String photo;
    private String funFacts;
    private String linkedIn;



    public TeamPage(String name, String photo, String funFacts, String linkedIn) {
        this.name = name;
        this.photo = photo;
        this.funFacts = funFacts;
        this.linkedIn = linkedIn;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getFunFacts() {
        return funFacts;
    }

    public String getLinkedIn() {
        return linkedIn;
    }
}
