package co.dyvrspages.guide.storages;

import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.storages.repositories.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StoreStorage {
    private StoreRepository storeRepo;

    public StoreStorage(StoreRepository storeRepo) {
        this.storeRepo = storeRepo;
    }

    public StoreRepository getStoreRepo() {
        return storeRepo;
    }

    public Store findById(long id) {
        return storeRepo.findById(id).get();
    }

    public Collection<Store> findAllStores() {
        return (Collection<Store>) storeRepo.findAll();
    }

    public void save(Store store) {
        storeRepo.save(store);
    }
}
