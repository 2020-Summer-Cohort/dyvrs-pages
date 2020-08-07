package co.dyvrspages.guide.storages.repositories;

import co.dyvrspages.guide.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
