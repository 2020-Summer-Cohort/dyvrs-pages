import {
    fetchCategory
} from "../fetch-api.js"

export {
    renderCategory
}

const renderCategory = (categoryId) => {
    fetchCategory(categoryId).then(category => {
        const ul = document.createElement('ul');
       console.log(category)
        for (let i = 0; i < category.length; i++){
        const li = document.createElement('li');
        li.innerHTML = `
            <a href="./individualStore.html" > 
            <img class="category__business--img" src="${category[i].image}" alt="Company Name Here Photo">
            <div class="category__business--company-name">${category[i].name}</div>
            </a>
        `
        ul.appendChild(li);
        }
        const h2 = document.querySelector('.category__business--title')
        h2.appendChild(ul);
    }
)}
// for (let i = 0; i < category.store.length; i++){
//     const li = document.createElement('li');
//     li.classList.add('category__business--img')
//     const storeImg = new image;
//     storeImg.src = categories.store[i].image;
//     `
//         <a href="./individualStore.html" > 
//         <img class="category__business--img" src="${category.store[i].image}" alt="Company Name Here Photo">
//         <div class="category__business--company-name">${category.store[i].name}</div>
//         </a>
//     `
//     ul.appendChild(li);
//     }