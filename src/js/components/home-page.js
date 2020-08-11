import { fetchSpotlight, fetchAllCategories } from "../fetch-api.js";
export { renderSpotlightOne, renderCategoryCircle };
const renderSpotlightOne = () => {
  for(let i = 0; i<5; i++){
    fetchSpotlight().then((store) => {
      const spotlightOne = document.createElement("li");
      spotlightOne.classList.add("index__spot-light--list-item");
      spotlightOne.innerHTML = `
          <img class="index__spot-light--img" src="${store.image}" alt="Company Name Here Photo">
          <div class="index__spot-light--company-name">${store.name}</div>
          `;
      const ul = document.querySelector(".index__spot-light--container-list");
      ul.appendChild(spotlightOne);
    });
  }};
  const renderCategoryCircle = () => {
    console.log("render cat");
    fetchAllCategories().then((category)=>{
      const indexCategory = document.querySelector(".index__category")
      const indexCircleContainer = document.createElement("div")
      indexCircleContainer.classList.add("index__circle_container")
      let degree = 0;
      for (let i = 0; i < category.length; i++) {
        const categoryClick = document.createElement('a');
        categoryClick.classList.add(`deg${degree}`);
        categoryClick.innerHTML = `
          <img src="${category[i].image}"><h4 class="index__single-category--name">${category[i].name}</h4>
          `
        degree += 45;
        indexCircleContainer.appendChild(categoryClick);
      }
        indexCategory.appendChild(indexCircleContainer);
    })
  }
