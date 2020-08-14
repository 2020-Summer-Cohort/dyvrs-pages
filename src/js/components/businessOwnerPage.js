import { addNewStore } from "../fetch-api.js";
import { renderSpotlightOne, renderCategoryCircle } from "./home-page.js";

export{renderBusinessOwnerPage}
console.log("above");
const renderBusinessOwnerPage = () => {
    const portalPage = document.querySelector("#portal-page");
    const newUserPage = document.querySelector("#new-user-page");
    const updateUserLogin = document.querySelector("#update-user-login");
    const submitUserButton = document.querySelector(".update-user-button");
    const newUserButton = document.querySelector(".new-user-button");
    submitUserButton.addEventListener("click", ()=> {
        portalPage.classList.toggle("hidden");
        updateUserLogin.classList.toggle("hidden");
        console.log("Inside submitUserButton - businessOwnerPage.js");
    })
    newUserButton.addEventListener("click", ()=> {
        portalPage.classList.toggle("hidden");
        newUserPage.classList.toggle("hidden");
        console.log("Inside newUserButton - businessOwnerPage.js");
    })

    // Submit button
    const updateStoreSubmitButton = document.querySelector(".update__submit-button");

    //Form fields
    const updateName = document.querySelector("#update__business-name");
    const updatePhoneNumber = document.querySelector("#update__phone-number");
    const updateAddress = document.querySelector("#update__address");
    const updateWebsite = document.querySelector("#update__website");
    const updateBusinessHours = document.querySelector("#update__business-hours");
    const updateAbout = document.querySelector("#update__about");
    const updateProductList = document.querySelector("#update__product-list");
    const updateCategory = document.querySelector("#update__category");
    const updatePic = document.querySelector("#update__pic");

    updateStoreSubmitButton.addEventListener("click", ()=> {
        const store = {
            name: updateName.value,
            phoneNumber: updatePhoneNumber.value,
            address: updateAddress.value,
            website: updateWebsite.value,
            storeHours: updateBusinessHours.value,
            image: "https://raw.githubusercontent.com/2020-Summer-Cohort/dyvrs-pages/add-photos/static/images/Stores/sample.jpg",
            description: updateAbout.value,
            productList: updateProductList.value,
        }
        const categoryId = updateCategory.value;
        console.log(updatePic.value);
        addNewStore(store, categoryId).then(()=> {
            alert(`${store.name} successfully added`);
        })
    })
}

