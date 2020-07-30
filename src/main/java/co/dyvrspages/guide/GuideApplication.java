package co.dyvrspages.guide;

import co.dyvrspages.guide.entities.CategoryLists;
import co.dyvrspages.guide.entities.StorePage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Collection;

@SpringBootApplication
public class GuideApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuideApplication.class, args);
    }


}
