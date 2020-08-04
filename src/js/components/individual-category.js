import {
    fetchCategory
} from "../fetch-api.js"

export {
    renderCategory
}

const renderCategory = (categoryId) => {
    fetchCategory(categoryId).then(category, () => {
        const ul = document.createElement('ul');
       
        for (let i = 0; i < category.store.length; i++){
        const li = document.createElement('li');
        li.innerHTML = `
            <a href="./individualStore.html" > 
            <img class="category__business--img" src="${store[i].image}" alt="Company Name Here Photo">
            <div class="category__business--company-name">${store[i].name}</div>
            </a>
        `
        ul.appendChild(li);
        } 
    }
)}
