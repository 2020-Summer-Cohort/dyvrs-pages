package co.dyvrspages.guide.storages.repositories;

import co.dyvrspages.guide.entities.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Long> {
}
