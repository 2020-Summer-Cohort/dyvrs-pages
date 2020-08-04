package co.dyvrspages.guide;

import co.dyvrspages.guide.entities.Category;
import co.dyvrspages.guide.entities.Store;
import co.dyvrspages.guide.entities.Team;
import co.dyvrspages.guide.storages.repositories.CategoryRepository;
import co.dyvrspages.guide.storages.repositories.StoreRepository;
import co.dyvrspages.guide.storages.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    CategoryRepository categoryRepo;

    @Autowired
    StoreRepository storeRepo;

    @Autowired
    TeamRepository teamRepo;

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category("Food", "");
        Category category2 = new Category("Apparel", "");
        Category category3 = new Category("Consumer Services", "");
        Category category4 = new Category("Health & Wellness", "");
        Category category5 = new Category("Grocery Store", "");
        Category category6 = new Category("Petrol Stations", "");
        Category category7 = new Category("Lodging", "");
        Category category8 = new Category("Associations", "");

        categoryRepo.save(category1);
        categoryRepo.save(category2);
        categoryRepo.save(category3);
        categoryRepo.save(category4);
        categoryRepo.save(category5);
        categoryRepo.save(category6);
        categoryRepo.save(category7);
        categoryRepo.save(category8);


        Store store1 = new Store("Awadh India Restaurant", "(614)-914-8884", "2584 Bethel Rd, Columbus, OH 43220", "https://awadhindiarestaurant.com/", "W-S: 12-10PM & M&T:5-PM", "", "It was established as one of the twelve original subahs (top-level imperial provinces) under 16th-century Mughal emperor Akbar and became a hereditary tributary polity around 1722, with Faizabad as its initial capital and Saadat Ali Khan as its first Subadar Nawab and progenitor of a dynasty of Nawabs of Awadh.", "Vegan Friendly & Indian Food", category1);
        Store store2 = new Store("Lalibela Restaurant", "(614) 235-5355", "2584 Bethel Rd, Columbus, OH 43220", "lalibelacolumbus100@gmail.com", "Su-Tr: 10AM-11PM & F-Sa: 10AM-midnight", "", "Lalibela Ethiopian Restaurant in Columbus, Ohio is a full-service, authentic Ethiopian restaurant serving a reasonably-priced breakfast, lunch and dinner menu. Our clean, vibrant, well-managed restaurant is warm and inviting. Guests are treated to traditional Ethiopian cuisine. The restaurant also boasts a full bar and billiards room. Lalibela is located on the east side of Columbus, Ohio in the community of Whitehall. The restaurant’s physical address is 1111 S. Hamilton Ave., where we share ", " Ethiopian Food, Coffee Ceremony & Billards", category1);
        Store store3 = new Store("Golden House Restaurant", "(614)447-2264", "3518 Cleveland Ave, Columbus, OH 43224", "https://awadhindiarestaurant.com/", "M-Th: 11AM-10PM, F&S: 11AM-11PM, S: 12PM-9:30PM", "", "Basic counter-serve place for a long menu of Chinese takeout standards, plus lunch specials.", "Cantonese, Hunan, Szechuan Food & Vegetarian Friendly", category1);
        Store store4 = new Store("Asian Clothing & Accessories( Nepali Clothing Store)", "(716) 602-4069", "1784 Morse Rd B, Columbus, OH 43229", "https://asian-clothing-accessories.business.site/", "S-S: 9AM-9PM", "", "Asian Clothing & Accessories( Nepali Clothing Store). Clothing Store in Columbus. Opening at 9:00 AM. Get QuoteCall nowGet directionsWhatsAppMessage", "Clothing, Shoes, & Saree's", category2);
        Store store5 = new Store("RawYoga614", "614-421-7522", "7339 East. Main Street, Reynoldsburg, 43068", "https://www.rawyoga614.com/", "M+W+Th: 10-6PM ; Sa: 10-4PM ; Su: 12-4PM ; Tu+F: Closed", "", "We've missed our RawYoga614 family! In the past, we've only been open for retail right before and after classes. Now , we're open for  shopping, online ordering, and pick up!Please plan to wear a mask to protect yourself while in our studio. We appreciate you willingness to keep us all safe.DUE TO EVERYTHING HAPPENING IN OUR WORLD, YOGA IS NEEDED MORE THAN EVER. OUR GOAL HAS ALWAYS BEEN TO MAKE YOGA MORE ACCESSIBLE, ESPECIALLY TO PEOPLE OF COLOR. ALL WEEKLY CLASSES ARE DONATION BASED UNTIL FURTHER NOTICE!SUPPORT US BY DONATING", "Yoga, Classes, Workshops and Training", category4);
        Store store6 = new Store("Arne Boutique", "(614) 806-5613", "2704 Billingsley Rd, Columbus, OH 43235", "https://www.arneus.com/", "W-S: 1PM-7PM, Sun: 1PM-6PM, & M-T: Closed ", "", "Clothing boutique specializing in traditional Indian apparel, shoes & accessories for women & men.", " Saree, Shirts, Tops, Men's Apparel, & Shoes", category2);
        Store store7 = new Store("Pipes & Pleasures", "(614) 235-6422\n", "4244 E. Main St. Columbus, Oh 43213", "https://www.facebook.com/LuvOurPipesandCigars", "M-F: 12PM-5PM, S: 10:30AM-9PM, & Sun: Closed", "", "Looking for premium smoking pipes, tobacco, and cigars in Columbus, OH? Pipes & Pleasures is your destination. Visit out Espinosa Cigar Lounge.", "Pipes, Tobacco, and Cigars", category3);
        Store store8 = new Store("Patel Brothers", "(614) 792-8484", "6600 Sawmill Rd, Columbus, OH 43235", "https://www.patelbros.com/specials/6600-saw-mill-rd-columbus", "W-M: 11AM-8PM T: Closed", "", "At Patel Brothers, our mission is to bring the best ingredients from around the world, right to your doorstep. With a wide variety of authentic regional ingredients, we strive to reconnect people with the familiar flavor of India.", "Frozen Foods, Produce, Spices, Dried Goods, & Indian Sweets", category5);
        Store store9 = new Store("Mobile Mommies LLC", "877-311-4556", "--", "https://www.mymobilemommies.com/", "By appointment", "", "No Mess ... No Fuss ... Leave the Kids with US!", "Childcare, Babysitting", category3);
        Store store10 = new Store("Mukha Custom Cosmetics", "(614) 294-7546", "980 N High St, Columbus, OH 43201", "https://www.mukhaspa.com/", "T-F: 10AM-7PM, S: 9AM-4PM, & S-M: Closed", "", "The latest Tweets from Mukha Spa (@MukhaSpa). Mukha Custom Cosmetics and Medi-Spa represents a revolution in the skin care and cosmetics industry.", "Skin Care, Spa, & Makeup", category4);
        Store store11 = new Store("Japan Marketplace", "NA", "1169 Old Henderson Rd, Columbus, OH 43220", "https://japanmarketplace.com/", "M-S: 10AM-8PM & Sun: 11AM-8PM", "", "Bustling market with shops & restaurants selling Japanese baked goods, homewares, sushi & rame", "Product, Meat, Dried Goods, Sweets, Frozen Foods, Baked Goods & Spices", category5);
        Store store12 = new Store("Plush Nail Salon", "(614) 326-3630", "1186 Kenny Centre Mall, Columbus, OH 43220", "http://plushnailsalon.com/", "Closed due to CV19", "", "Plush Nail Salon is a fun, edgy and up beat salon that takes pride in our creativity and cleanliness! Learn more about us and what we offer by checking out our services list.Book an appointment for any of our services online any time - day or night! We will confirm your appointment through text or e-mail when we receive it. If you need to get in touch during business hours, please see our contact details", "Nail Care & Waxing", category4);
        Store store13 = new Store("Universal Medical Staffing Agency LLC ", "(614) 274-9092", "3774 Broadway, Grove City, OH 43123", "http://www.homehealthcare4u.net/", "M-F:9AM-4PM", "", "Universal Medical Staffing Agency LLC is a licensed, registered, insured, and locally owned home health care agency serving families within a 30-mile radius of Grove City, OH. We mobilize a team of trained and experienced caregivers to provide comprehensive therapy and nonmedical services to local patients in the comforts of their own home. Striving to consistently deliver the highest standard of home health care to the families we serve, we promise to care for your loved one with compassion, respect, dignity, and concern.", "Home Care & Medical Staffing", category4);
        Store store14 = new Store("Aiko Nail And Beauty Supply", "(614) 947-1008", "1249 Morse Rd, Columbus, OH 43229", "https://www.facebook.com/Aiko-Nail-And-Beauty-Supply-1783846055011736/", "M-Th: 9AM-8PM, F: 9AM-6PM,S: Closed, & Sun: 10AM-6PM", "", "Nail salon", "Beauty Supplies & Nails", category4);
        Store store15 = new Store("Karimah Homes", "(614) 343-0609", "2, Groveport Rd, Groveport, OH 43125", "https://www.karimahhomes.com/contact-us.html", "NA", "", "Karimah Homes, LLC is a licensed, bonded General Contractor providing “Home Remodeling / Fire Restoration” services to housing projects as well as business entities throughout the Central Ohio area and its surrounding communities. Karimah Homes, LLC owner Mr. Kevin Bolding  has over 25-years of Master Craftsmenship he brings to the company.   His trusted partner Mr. Wil Anderson of “Quality Carpet Sales & Furniture” brings over 30-years of expertise flooring experience to the company forging a dynamic duo in the construction industry.", "Home Improvement Services", category3);
        Store store16 = new Store("Williams Interior Design", "(614) 418-7250", "2168 Citygate Dr, Columbus, OH 43219", "http://williamsinteriordesigns.com/", "", "", "Williams Interior Designs is a highly successful Woman Owned Enterprise, Minority Business Enterprise, and Disadvantaged Business Enterprise (WBE, MBE, DBE) providing integrated office supply, furniture design, and procurement solutions for local, national, and international companies and organizations of every size.", "Corporate Interior Design", category3);
        Store store17 = new Store("Allied Cleaning Solutions", "(614) 500-8582", "1783 Canvasback Ln, Columubs, OH, 43215", "https://www.usaopps.com/government_contractors/contractor-6040639-Allied-Cleaning-Solution.htm", "NA", "", "Allied Cleaning Solutions is a veteran owned/operated facilities maintenance company. We provide facilities maintenance, janitorial services and supplies to meet all commercial cleaning, post-construction (final clean), and repair needs.", "Corporate Office Cleaning", category3);
        Store store18 = new Store("A Perfect Klean LLC", "(614)859-2536", "P.O. Box 1488,Reynoldsburg, OH 43068", "https://www.care.com/b/l/a-perfect-klean-llc/reynoldsburg-oh", "NA", "", "A Perfect Klean, LLC is a Commercial & Residential cleaning company providing service to Columbus, OH and the surrounding areas (within 40 miles of downtown Columbus).", "Commercial & Residential Cleaning", category3);
        Store store19 = new Store("Facemyer Landscaping LLC", "(740) 965-4616", "72 Holmes St, Galena, OH 43021", "https://facemyer.com/", "NA", "", "Facemyer Company – a heavy equipment construction company providing earthwork, utility and landscaping services. From start to finish Facemyer has the equipment and the team to get the job done!", "Earth Work, Utilities, & Landscaping", category3);
        Store store20 = new Store("Berekum African Market", "(614) 268-8487", "1977 Morse Rd, Columbus, OH 43229", "http://www.africanchop.com/chopso.htm", "M-F: 10AM-8:30PM, S:9AM-8:30PM, & Sun: 1PM-^:30PM", "", "Explore traditional African foods. Find African markets and restaurants in your area.", "Produce, Dried Goods, Spices, ", category5);
        Store store21 = new Store("Four Points by Sheraton Columbus Ohio Airport", "(614) 475-8383", "3030 Plaza Properties Blvd, Columbus, OH 43219", "https://www.marriott.com/hotels/travel/cmhof-four-points-columbus-ohio-airport/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2", "24/7", "", "Reach new heights of comfort and convenience at Four Points by Sheraton Columbus Ohio Airport. After landing at John Glenn Columbus International Airport and picking up your luggage, take our complimentary shuttle to our hotel for a seamless travel experience. Upon arrival, you'll find yourself surrounded by some of the city's most popular attractions such as Ohio Stadium and LEGOLAND® Discovery Center Columbus.", "Lodging", category7);
        Store store22 = new Store("Country Inn & Suites by Radisson, Columbus Airport", "(614) 478-2900", "2900 Airport Dr, Columbus, OH 43219", "https://www.radissonhotels.com/en-us/hotels/country-inn-columbus-airport-oh?cid=a:se+b:gmb+c:amer+i:local+e:cis+d:us+h:OHCOLAIR", "24/7", "", "Conveniently located off I-670, the Country Inn & Suites by Radisson, Columbus Airport, OH provides quick access to area businesses and popular attractions in The Arch City. You can cheer on The Ohio State University Buckeyes at Ohio Stadium, about 12 minutes away, or attend other sporting events and concerts at Ohio Expo Center, less than 10 minutes from the hotel. Ideal for healthcare professionals visiting the area, we are also situated within four miles of VA Columbus Ohio and Ohio State East Hospital. When it’s time to head home, we offer a complimentary shuttle to John Glenn Columbus International Airport (CMH), located about one mile away. Traveling for work? Our hotel offers convenient access to the Greater Columbus Convention Center and features an on-site meeting space and business center. When you’re ready to relax, unwind with a swim in the heated indoor pool or squeeze in a workout in the fitness center. Don’t worry about forgetting your toothbrush at home since we offer a variety of personal items through our Did You Forget? Program. We also offer room service through Order Inn.", "Lodging", category7);
        Store store23 = new Store("German Village Inn Columbus", "(614) 443-6506", "920 S High St, Columbus, OH 43206", "http://www.germanvillageinn.net/", "24/7", "", "We want to inform our future guests of our policy and operational procedures as it pertains to the coronavirus (covid-19).We have put in place strict changes to ensure your safety and peace of mind based on recommendations from the Center for Disease Control.", "Lodging", category7);
        Store store24 = new Store("Global Mall", "(206) 278-6481", "2210 Morse Rd D6, Columbus, OH 43229", "NA", "NA", "", "Somali and international clothing store", "Cloths", category2);
        Store store25 = new Store("Sunoco Gas Station", "(614) 846-6966", "1623 E Dublin Granville Rd, Columbus, OH 43229", "https://www.sunoco.com/find-a-station", "24/7", "", "Gas station", "Gas, toiltris, & Snacks", category6);
        Store store26 = new Store("Asian American Commerce Group", "NA", "NA", "https://members.aacg.org/contact/", "NA", "", "The Asian American Commerce Group (AACG) was formed in 1993 after the City of Columbus created a Minority Business Program that did not include Asian-American owned businesses. At the time, the Asian American community in Central Ohio was not politically active and mostly socialized among their own ethnic groups. The formation of the Asian American Commerce Group served as a catalyst to unite these distinct ethnic groups under one voice and increased their economic and political impact in the region. Culturally, AACG supported the Asian Festival in bringing the Asian community together to create one of the largest Asian Festivals in the nation. In 2000, after years of lobbying by the AACG and the Asian community the City of Columbus extended the Minority Business Program to include Asian-American owned businesses.", "Community & Networking Events", category8);
        Store store27 = new Store("Asian Women In Business", "NA", "NA", "http://www.awib.org/index.cfm?fuseaction=page.viewPage&pageID=861&nodeID=1", "NA", "", "Asian Women In Business is no longer an active organization and we have ceased sponsoring programs. We gave up our office when the lease expired last year and have been maintaining a skeleton voluntary operations.  You may still receive occasional emails and we will answer emails at info@awib.org until the end of 2020.  At that time, we will permanently close the organization.", "Community & Networking Events", category8);
        Store store28 = new Store("The National Black MBA Association", "NA", "NA", "http://columbusbmba.org/", "NA", "", "The National Black MBA Association® (NBMBAA) was founded in 1970 at a two-day conference held at the University of Chicago, by a group of African American MBA students, faculty, advisors, and businessmen. Founded in 1993, the NBMBAA Columbus Chapter has created programs that helped professional career minded people as well as our youth. Being named Chapter of the Year six times in a row, the Columbus Chapter has been very proactive in the Central Ohio Community.", "Community & Networking Events", category8);
        Store store29 = new Store("Central Ohio African American Chamber of Commerce", "614-377-4874", "P.O. Box 83233, Columbus, Ohio 43203", "http://www.coaacc.org/", "NA", "", "The Central Ohio African American Chamber of Commerce (COAACC) opened for membership on  January 18, 2018 with the vision of being the premiere advocate for Black Owned businesses in our region. COAACC is a one-stop shop that develops, advocates, and educates on issues impacting the inclusion and growth of Black owned businesses in Central Ohio. We provide business development opportunities, access to capital, entry into new markets, and relationship building through strategic partnership and collaborative opportunities. We work to position our members, and all Black Owned businesses, as desirable, qualified, and capable business candidates.", "Community & Networking Events", category8);
        Store store30 = new Store("Disability Rights Ohio", "(800) 282-9181", "200 S Civic Center Dr #300, Columbus, OH 43215", "https://www.disabilityrightsohio.org/", "NA", "", "We envision a society in which people with disabilities are full and equal members, enjoy the rights and opportunities of all people, are self-directed, make decisions about where, how and with whom they will live, learn, work and play, have access to needed services and supports, and are free from abuse, neglect, exploitation and discrimination.", "Community & Networking Events", category8);


        storeRepo.save(store1);
        storeRepo.save(store2);
        storeRepo.save(store3);
        storeRepo.save(store4);
        storeRepo.save(store5);
        storeRepo.save(store6);
        storeRepo.save(store7);
        storeRepo.save(store8);
        storeRepo.save(store9);
        storeRepo.save(store10);
        storeRepo.save(store11);
        storeRepo.save(store12);
        storeRepo.save(store13);
        storeRepo.save(store14);
        storeRepo.save(store15);
        storeRepo.save(store16);
        storeRepo.save(store17);
        storeRepo.save(store18);
        storeRepo.save(store19);
        storeRepo.save(store20);
        storeRepo.save(store21);
        storeRepo.save(store22);
        storeRepo.save(store23);
        storeRepo.save(store24);
        storeRepo.save(store25);
        storeRepo.save(store26);
        storeRepo.save(store27);
        storeRepo.save(store28);
        storeRepo.save(store29);
        storeRepo.save(store30);

        Team team1 = new Team("Robyn Chambers", "string", "Loves gardening.", "www.linkedin.com/in/robyn-chambers");
        Team team2 = new Team("Jason Orabella", "string", "I've bred endangered fish", "https://www.linkedin.com/in/jason-osu/");
        Team team3 = new Team("Christin Banerjee", "string", "My favorite movie is Meet Me in St Louis.", "https://www.linkedin.com/in/christin-banerjee/");
        Team team4 = new Team("Mignonne Silva", "string", "TBA", "https://www.linkedin.com/in/mignonne-silva/");
        Team team5 = new Team("Cameron Resuta", "string", "I love sushi.", "https://www.linkedin.com/in/cameron-resuta/");
        Team team6 = new Team("Shawn Daniels", "string", "Gay penguins adopt the offspring of their fallen comrades.", "https://www.linkedin.com/in/drshawndaniels/");

        teamRepo.save(team1);
        teamRepo.save(team2);
        teamRepo.save(team3);
        teamRepo.save(team4);
        teamRepo.save(team5);
        teamRepo.save(team6);





    }
}

