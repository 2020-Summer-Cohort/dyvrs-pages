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
    const submitButton = document.querySelector(".update__submit-button");
    const updatePhoneNumber = document.querySelector(".update__phone-number");
    const updateEmail = document.querySelector(".update__email");
    const updateWebsite = document.querySelector(".update__website");
    const updateBusinessHours = document.querySelector(".update__business-hours");
    const updateAbout = document.querySelector(".update__about");
    const updateProductList = document.querySelector(".update__product-list");
    submitButton.addEventListener("click", ()=> {
        const store = {
            phoneNumber: phoneNumber.value,
        }
    })
}

