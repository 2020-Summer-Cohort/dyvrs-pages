package co.dyvrspages.guide.controllers;


import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.storages.StoreStorage;
import co.dyvrspages.guide.storages.repositories.StoreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    public Store findStoreById(@PathVariable long id) {
        return storeStorage.findById(id);
    }

    @GetMapping("/api/stores/random/")
    public Store findRandomStore(){
        return storeStorage.findRandom();
    }

    @PostMapping("/api/categories/store/add/")
    public Collection<Store> addStore(@RequestBody Store store) {
        storeStorage.save(store);
        return storeStorage.findAllStores();
    }


    @PatchMapping("/api/stores/{id}/update-store/")
    public Store updateStoreInfo(@PathVariable long id, @RequestBody Store store) {
        Store storeToUpdate = storeStorage.findById(id);
        Store updateToStore = new Store(store.getName(), store.getPhoneNumber(), store.getAddress(), store.getWebsite(), store.getStoreHours(), store.getImage(), store.getDescription(), store.getProductList(), store.getCategory());
        storeStorage.save(updateToStore);
        return
    }

    @PatchMapping("/api/stores/{id}/update-store/")
    public Store updateStoreInfo(@PathVariable long id, @RequestBody Store store) {
        Store storeToUpdate = storeStorage.findById(id);
        storeToUpdate.setPhoneNumber(store.getPhoneNumber());
        storeToUpdate.setBusinessHours(store.getBusinessHours());
        storeStorage.save(updateToStore);
        return updateToStore;

    @DeleteMapping("/api/categories/{id}/")
    public Collection<Store> deleteStore(@PathVariable long id) {
        storeStorage.delete(id);
        return storeStorage.findAllStores();

    }


}
