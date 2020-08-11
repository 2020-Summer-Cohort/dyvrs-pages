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

        <img src=""><h4 class="index__single-category--name"> ${category.name} </h4> ${category.id}
        `
        degree += 45;
        indexCircleContainer.appendChild(categoryClick);
      }

    //   indexCircleContainer.innerHTML=
    //   ` 
    //   <a href="./categories.html" class='deg0 id4'><img src="../images/Health&Wellness.png"><h4 class="index__single-category--name">${category.name}</h4></a>
    //   <a href='./categories.html' class='deg45 id6'><img src='../images/GasStation.jpg'><h4 class="index__single-category--name">Gas Station</h4></a>
    //   <a href='./categories.html' class='deg90 id2'><img src='../images/Apparel.png'><h4 class="index__single-category--name">Apparel</h4></a>    
    //   <a href='./categories.html' class='deg135 id5'><img src='../images/GroceryStore.png'><h4 class="index__single-category--name">Grocery Store</h4></a>
    //   <a href='./categories.html' class='deg180 id8'><img src='../images/Association.png'><h4 class="index__single-category--name">Association</h4></a>
    //   <a href='./categories.html' class='deg225 id3'><img src='../images/ConsumerServices.png'><h4 class="index__single-category--name">Consumer Services</h4></a>
    //   <a href='./categories.html' class='deg270 id7'><img src='../images/Lodging.png'><h4 class="index__single-category--name">Lodging</h4></a>
    //   <a class='deg315 id1'><img src='../images/Food.png'><h4 class="index__single-category--name">Food</h4></a>
    //  `
      

     indexCategory.appendChild(indexCircleContainer);
        })
      }
//         <a th:href=${category.id}