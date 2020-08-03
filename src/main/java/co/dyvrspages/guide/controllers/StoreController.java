package co.dyvrspages.guide.controllers;


import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.storages.StoreStorage;
import co.dyvrspages.guide.storages.repositories.StoreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
    private StoreStorage storeStorage;

    public StoreController(StoreStorage storeStorage) {
        this.storeStorage = storeStorage;
    }

    public StoreStorage getStoreStorage() {
        return storeStorage;
    }

@GetMapping("/api/stores/{id}")
    public Store findStoreById(@PathVariable long id){
        return storeStorage.findById(id);
}
}
