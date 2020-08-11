package co.dyvrspages.guide.controllers;

import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.storages.CategoryStorage;
import co.dyvrspages.guide.storages.StoreStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafCategoryController {
    private final CategoryStorage categoryStorage;
    private final StoreStorage storeStorage;

    public ThymeLeafCategoryController(CategoryStorage categoryStorage, StoreStorage storeStorage){
        this.categoryStorage = categoryStorage;
        this.storeStorage = storeStorage;
    }

    @RequestMapping({"", "/"})
    public String showHomePage(Model model){
        model.addAttribute("category", categoryStorage.findAll());
        model.addAttribute("Store", storeStorage.findAllStores());
        return "home-template";
}
//    @GetMapping("home")
//    public String showAllCampuses(Model model){
//        model.addAttribute("category", categoryStorage.findAll());
//        return "home-template";
//    }

}
