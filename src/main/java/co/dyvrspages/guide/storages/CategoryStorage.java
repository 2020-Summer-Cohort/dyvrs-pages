package co.dyvrspages.guide.storages;

import co.dyvrspages.guide.entities.Category;
import co.dyvrspages.guide.storages.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryStorage {
    private final CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public CategoryRepository getCategoryRepo() {
        return categoryRepo;
    }

    public Collection<Category> findAll() {
        return (Collection<Category>) categoryRepo.findAll();
    }

    public Category findById(Long id) {
        return categoryRepo.findById(id).get();
    }
}
