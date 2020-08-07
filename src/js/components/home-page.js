import { fetchSpotlight, fetchAllCategories } from "../fetch-api.js";

export { renderSpotlightOne, renderCategoryCircle };

const renderCategoryCircle = () => {
  fetchAllCategories().then((categories)=>{
const indexCategory = document.querySelector(".index__category")
indexCategory.innerHTML=` <div class="index__circle_container">
<a href="./categories.html" class='center'><img src="http://imgsrc.hubblesite.org/hu/db/images/hs-2005-37-a-thumb.jpg" alt="Company Name Here Photo"></a> -->
<a href="./categories.html" class='deg0'><img src="../images/Health&Wellness.png"><h4 class="index__single-category--name">Health and Wellness</h4></a>
<a href='./categories.html' class='deg45'><img src='../images/GasStation.jpg'><h4 class="index__single-category--name">Gas Station</h4></a>
<a href='./categories.html' class='deg90'><img src='../images/Apparel.png'><h4 class="index__single-category--name">Apparel</h4></a>    
<a href='./categories.html' class='deg135'><img src='../images/GroceryStore.png'><h4 class="index__single-category--name">Grocery Store</h4></a>
<a href='./categories.html' class='deg180'><img src='../images/Association.png'><h4 class="index__single-category--name">Association</h4></a>
<a href='./categories.html' class='deg225'><img src='../images/ConsumerServices.png'><h4 class="index__single-category--name">Consumer Services</h4></a>
<a href='./categories.html' class='deg270'><img src='../images/Lodging.png'><h4 class="index__single-category--name">Lodging</h4></a>
<a href='./categories.html' class='deg315'><img src='../images/Food.png'><h4 class="index__single-category--name">Food</h4></a>
</div>`
  }) 
}
const renderSpotlightOne = () => {
    for(let i = 0; i<5; i++){
  fetchSpotlight().then((store) => {
    const spotlightOne = document.createElement("li");
    spotlightOne.classList.add("index__spot-light--list-item");
    spotlightOne.innerHTML = `
        <img class="index__spot-light--img" src="https://raw.githubusercontent.com/2020-Summer-Cohort/dyvrs-pages/html/static/images/${store.image}" alt="Company Name Here Photo">
        <div class="index__spot-light--company-name">${store.name}</div>
        `;
    const ul = document.querySelector(".index__spot-light--container-list");
    ul.appendChild(spotlightOne);
  });
}};
