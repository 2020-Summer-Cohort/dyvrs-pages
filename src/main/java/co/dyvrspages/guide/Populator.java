package co.dyvrspages.guide;

import co.dyvrspages.guide.entities.CategoryLists;
import co.dyvrspages.guide.entities.StorePage;
import co.dyvrspages.guide.repositories.CategoryListRepository;
import co.dyvrspages.guide.repositories.StorePageRepository;
import co.dyvrspages.guide.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    CategoryListRepository categoryListRepo;

    @Autowired
    StorePageRepository storePageRepo;

    @Autowired
    TeamRepository teamRepo;

    @Override
    public void run(String... args) throws Exception {

        CategoryLists category1 = new CategoryLists("Food", "");
        CategoryLists category2 = new CategoryLists("Apparel", "");
        CategoryLists category3 = new CategoryLists("Consumer Services", "");
        CategoryLists category4 = new CategoryLists("Health & Wellness", "");
        CategoryLists category5 = new CategoryLists("Grocery Store", "");
        CategoryLists category6 = new CategoryLists("Petrol Stations", "");
        CategoryLists category7 = new CategoryLists("Lodging", "");
        CategoryLists category8 = new CategoryLists("Person Care", "");

        categoryListRepo.save(category1);
        categoryListRepo.save(category2);
        categoryListRepo.save(category3);
        categoryListRepo.save(category4);
        categoryListRepo.save(category5);
        categoryListRepo.save(category6);
        categoryListRepo.save(category7);
        categoryListRepo.save(category8);


        StorePage store1 = new StorePage("Awadh India Restaurant", "(614)-914-8884", "2584 Bethel Rd, Columbus, OH 43220", "https://awadhindiarestaurant.com/", "W-S: 12-10PM & M&T:5-PM", "", "It was established as one of the twelve original subahs (top-level imperial provinces) under 16th-century Mughal emperor Akbar and became a hereditary tributary polity around 1722, with Faizabad as its initial capital and Saadat Ali Khan as its first Subadar Nawab and progenitor of a dynasty of Nawabs of Awadh.", "Vegan Friendly & Indian Food", category1);
        StorePage store2 = new StorePage("Lalibela Restaurant", "(614) 235-5355", "2584 Bethel Rd, Columbus, OH 43220", "lalibelacolumbus100@gmail.com", "Su-Tr: 10AM-11PM & F-Sa: 10AM-midnight", "", "Lalibela Ethiopian Restaurant in Columbus, Ohio is a full-service, authentic Ethiopian restaurant serving a reasonably-priced breakfast, lunch and dinner menu. Our clean, vibrant, well-managed restaurant is warm and inviting. Guests are treated to traditional Ethiopian cuisine. The restaurant also boasts a full bar and billiards room. Lalibela is located on the east side of Columbus, Ohio in the community of Whitehall. The restaurant’s physical address is 1111 S. Hamilton Ave., where we share "," Ethiopian Food, Coffee Ceremony & Billards",category1);
        StorePage store3 = new StorePage("Golden House Restaurant", "(614)447-2264", "3518 Cleveland Ave, Columbus, OH 43224", "https://awadhindiarestaurant.com/", "M-Th: 11AM-10PM, F&S: 11AM-11PM, S: 12PM-9:30PM", "", "Basic counter-serve place for a long menu of Chinese takeout standards, plus lunch specials.","Cantonese, Hunan, Szechuan Food & Vegetarian Friendly", category1);
        StorePage store4 = new StorePage("Asian Clothing & Accessories( Nepali Clothing Store)","(716) 602-4069", "1784 Morse Rd B, Columbus, OH 43229","https://asian-clothing-accessories.business.site/","S-S: 9AM-9PM","","Asian Clothing & Accessories( Nepali Clothing Store). Clothing Store in Columbus. Opening at 9:00 AM. Get QuoteCall nowGet directionsWhatsAppMessage","Clothing, Shoes, & Saree's",category2);
        StorePage store5 = new StorePage("RawYoga614", "614-421-7522", "7339 East. Main Street, Reynoldsburg, 43068", "https://www.rawyoga614.com/", "M+W+Th: 10-6PM ; Sa: 10-4PM ; Su: 12-4PM ; Tu+F: Closed", "", "We've missed our RawYoga614 family! In the past, we've only been open for retail right before and after classes. Now , we're open for  shopping, online ordering, and pick up!Please plan to wear a mask to protect yourself while in our studio. We appreciate you willingness to keep us all safe.DUE TO EVERYTHING HAPPENING IN OUR WORLD, YOGA IS NEEDED MORE THAN EVER. OUR GOAL HAS ALWAYS BEEN TO MAKE YOGA MORE ACCESSIBLE, ESPECIALLY TO PEOPLE OF COLOR. ALL WEEKLY CLASSES ARE DONATION BASED UNTIL FURTHER NOTICE!SUPPORT US BY DONATING", "Yoga, Classes, Workshops and Training", category4);
        StorePage store6 = new StorePage("Arne Boutique","(614) 806-5613", "2704 Billingsley Rd, Columbus, OH 43235","https://www.arneus.com/","W-S: 1PM-7PM, Sun: 1PM-6PM, & M-T: Closed ","","Clothing boutique specializing in traditional Indian apparel, shoes & accessories for women & men."," Saree, Shirts, Tops, Men's Apparel, & Shoes",category2);
        StorePage store7 = new StorePage("Pipes & Pleasures","(614) 235-6422\n", "4244 E. Main St. Columbus, Oh 43213","https://www.facebook.com/LuvOurPipesandCigars","M-F: 12PM-5PM, S: 10:30AM-9PM, & Sun: Closed","","Looking for premium smoking pipes, tobacco, and cigars in Columbus, OH? Pipes & Pleasures is your destination. Visit out Espinosa Cigar Lounge.","Pipes, Tobacco, and Cigars",category3);

        StorePage store8 = new StorePage("Patel Brothers","(614) 792-8484","6600 Sawmill Rd, Columbus, OH 43235","https://www.patelbros.com/specials/6600-saw-mill-rd-columbus","W-M: 11AM-8PM T: Closed","","At Patel Brothers, our mission is to bring the best ingredients from around the world, right to your doorstep. With a wide variety of authentic regional ingredients, we strive to reconnect people with the familiar flavor of India.","Frozen Foods, Produce, Spices, Dried Goods, & Indian Sweets",category5);

        StorePage store9 = new StorePage("","", "","","","","","","");


        StorePage store10 = new StorePage("""""""");
    }







}
