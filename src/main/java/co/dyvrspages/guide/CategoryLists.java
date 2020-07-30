package co.dyvrspages.guide;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class CategoryLists {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String image;
    @OneToMany(mappedBy = "categoryLists")
    private Collection<IndividualCategoryPage> individualCategoryPage;

    public CategoryLists(String name, String image) {
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
