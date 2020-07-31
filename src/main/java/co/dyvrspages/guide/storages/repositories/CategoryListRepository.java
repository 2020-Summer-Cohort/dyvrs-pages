package co.dyvrspages.guide.storages.repositories;

import co.dyvrspages.guide.entities.CategoryLists;
import org.springframework.data.repository.CrudRepository;

public interface CategoryListRepository extends CrudRepository<CategoryLists, Long> {

}
