import {
    fetchCategory
} from "../fetch-api.js"

export {
    renderCategory
}

const renderCategory = (categoryId) => {
    fetchCategory(categoryId).then(category => {
        const ul = document.createElement('ul');
        ul.classList.add("category__business--container-list")

       category.store.forEach(store => {
        const li = document.createElement('li');
        li.classList.add("category__business--list-item")
        li.innerHTML = `
            <a href="./individualStore.html" > 
            <img class="category__business--img" src="${store.image}" alt="${store.name} Photo">
            <div class="category__business--company-name">${store.name}</div>
            </a>
        `
        ul.appendChild(li);
        })

        const h2 = document.querySelector('.category__business--title')
        h2.innerHTML = category.name
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