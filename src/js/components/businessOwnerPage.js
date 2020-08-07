export{
    renderBusinessOwnerPage,
    updateOwnerPageFunction
}

console.log("above");
const renderBusinessOwnerPage = () => {
    // document.getElementById ('portal-page').style.display="block";

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
    // if(clickable){
    //     document.getElementById ('new-user-page').style.display="block";
    // } if(x){
    //     document.getElementById ('update-user-login').style.display="block";
    // }
    // else{
    //     document.getElementById ('portal-page').style.display="block";
    // }

// function portalOwnerPageFunction() {
    // const portalPage = document.querySelector(".portal-page");
    // if (portalPage.style.visibility === 'none' || portalPage.style.display) {
    //     portalPage.style.visibility = 'visible';
    // } else {
    //     portalPage.style.visibility = 'hidden';
    // }

//     const updateOwnerPage = document.querySelector(".new-user-page");
//     const newUserButton = document.querySelector(".new-user-button")
//     newUserButton.addEventListener ("click", ()=>{
//     if (updateOwnerPage.style.visibility === 'none') {
//         updateOwnerPage.style.visibility = 'visible';
//         portalPage.style.visibility = 'hidden';
//     } else {
//         updateOwnerPage.style.visibility = 'hidden';
//     }
//     })
//   }

//   function newUserOwnerPageFunction() {
//     const newUserOwnerPage = document.querySelector(".new-user-page");
//     if (newUserOwnerPage.style.visibility === 'none') {
//         newUserOwnerPage.style.visibility = 'visible';
//         portalPage.style.visibility = 'hidden';
//         updateOwnerPage.style.visibility = 'hidden';
//     } else {
//         newUserOwnerPage.style.visibility = 'hidden';
//     }
//   }
  console.log("inside");
function updateOwnerPageFunction() {
    console.log("test")
}
  