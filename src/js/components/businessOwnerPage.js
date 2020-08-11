export{
    renderBusinessOwnerPage,
    updateOwnerPageFunction
}

console.log("above");
const renderBusinessOwnerPage = () => {
    
    const portalPage = document.querySelector("#portal-page")
    const newUserPage = document.querySelector("#new-user-page")
    const updateUserLogin = document.querySelector("#update-user-login")

    const submitUserButton = document.querySelector(".update-user-button")
    const newUserButton = document.querySelector(".new-user-button")

    submitUserButton.addEventListener("click", ()=> {
            portalPage.classList.toggle("hidden")
            updateUserLogin.classList.toggle("hidden")
            console.log("Inside event listener")   
        })
    newUserButton.addEventListener("click", ()=> {
            portalPage.classList.toggle("hidden")
            newUserPage.classList.toggle("hidden")
            console.log("Inside event listener")   
        })
    }
  console.log("inside");
function updateOwnerPageFunction() {
    console.log("test")
}
  