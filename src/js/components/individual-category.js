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
        console.log("Howdy the Third")
        category.store.forEach(store => {
        const li = document.createElement('li');
        li.classList.add("category__business--list-item")
        li.innerHTML = `
            <a href="./individualStore.html" > 
                <img class="category__business--img" src="/static/images/${store.image}" alt="${store.name} Photo">
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

