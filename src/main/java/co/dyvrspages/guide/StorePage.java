package co.dyvrspages.guide;

public class StorePage {
    private String name;
    private String phoneNumber;
    private String address;
    private String website;
    private String storeHours;
    private String image;
    private String description;
    private String productList;

    public StorePage(String name, String phoneNumber, String address, String website, String storeHours, String image, String description, String productList) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.website = website;
        this.storeHours = storeHours;
        this.image = image;
        this.description = description;
        this.productList = productList;
    }
    public String getName() {
        return name;
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
