import{
    fetchSpotlight
}from "../fetch-api.js"

export{
    renderSpotlightOne
}

const renderSpotlightOne = ()=>{
    fetchSpotlight().then(store =>{
        const spotlightOne = document.createElement('li');
        spotlightOne.classList.add('index__spot-light--list-item')
        spotlightOne.innerHTML = `
        <img class="index__spot-light--img" src="https://raw.githubusercontent.com/2020-Summer-Cohort/dyvrs-pages/html/static/images/${store.image}" alt="Company Name Here Photo">
        <div class="index__spot-light--company-name">${store.name}</div>
        `
        const ul = document.querySelector('.index__spot-light--container-list')
        ul.appendChild(spotlightOne);
    
    })
    }
    
}


