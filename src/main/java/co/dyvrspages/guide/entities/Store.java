package co.dyvrspages.guide.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String phoneNumber;
    private String address;
    private String website;
    private String storeHours;
    private String image;
    @Column(length = 100000)
    @Lob
    private String description;
    private String productList;
    @JsonIgnore
    @ManyToOne
    private Category category;

    protected Store(){};

    public Store(String name, String phoneNumber, String address, String website, String storeHours, String image, String description, String productList, Category category) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.website = website;
        this.storeHours = storeHours;
        this.image = image;
        this.description = description;
        this.productList = productList;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public String getStoreHours() {
        return storeHours;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getProductList() {
        return productList;
    }

}
