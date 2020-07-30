package co.dyvrspages.guide;

import javax.persistence.*;

@Entity
public class IndividualCategoryPage {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String image;
    @ManyToOne
    private CategoryLists categoryLists;


    public IndividualCategoryPage(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }








}
