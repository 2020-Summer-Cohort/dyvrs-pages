package co.dyvrspages.guide.controllers;


import co.dyvrspages.guide.entities.Category;
import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.storages.CategoryStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CategoryController {
    private CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    public CategoryStorage getCategoryStorage() {
        return categoryStorage;
    }

    @GetMapping("/api/index/")
    public Collection<Category> findAllCategories() {
        return categoryStorage.findAll();
    }

    @GetMapping("/api/category/{id}/")
    public Category findCategoryById(@PathVariable Long id) {
        return categoryStorage.findById(id);
    }

    @GetMapping("/api/category/{id}/stores/")
    public Collection<Store> findAllStoresInCateogry(@PathVariable long id) {
        return categoryStorage.findById(id).getStore();
    }

}
