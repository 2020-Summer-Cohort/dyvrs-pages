import { fetchStore } from "../fetch-api.js"

export { renderIndividualStore }

console.log("Howdy, y'all part 1")

const renderIndividualStore = (storeId) => {
    
    fetchStore(storeId).then(store => {
        const h2 = document.querySelector(".individual-store__title")
        h2.innerHTML = store.name
        const storeGridContainer = document.createElement("div")
        storeGridContainer.classList.add("individual-store__gridContainer")
        h2.appendChild(storeGridContainer)

        const storeImageListContainer = document.createElement("ul")
        storeGridContainer.appendChild(storeImageListContainer)
        const storeImageListItem = document.createElement("li")
        storeImageListItem.innerHTML = `<img class="individual-store__img" src="../images/spotLightImg.png" alt="Company Name Here Photo"></img>`
        storeGridContainer.appendChild(storeImageListItem)

        const gridContainerItem2 = document.createElement("div")
        gridContainerItem2.classList.add("individual-store__gridContainerItem2")
        gridContainerItem2.innerHTML = `
            <h3 class="individual-store__product-list">Product List:</h3>
            <ul class="individual-store__product_list_container">
                <li class="individual-store__item">${store.productList}</li>
            </ul>
            <ul class="individual-store__info-container">
                <li class="individual-store__info-item"> <h3>Telephone</h3> ${store.phoneNumber}</li>
                <li class="individual-store__info-item"><h3>Hours:</h3> ${store.storeHours}</li>
                <li class= "individual-store__info-item" ><a href="${store.website}" target="_blank">Website</a></li>
                <li class="individual-store__info-item"> <h3>Address: </h3><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3053.421509048636!2d-83.09333320000003!3d40.066009!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88389286770d318f%3A0x68fca9f1e927e7ec!2s2584%20Bethel%20Rd%2C%20Columbus%2C%20OH%2043220!5e0!3m2!1sen!2sus!4v1596045399373!5m2!1sen!2sus" width="300" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe></li>
            </ul>
            <h3 class="individual-store__about">About:</h3>
            <p class="individual-store__about-paragraph">${store.description}</p>
            `
        h2.appendChild(gridContainerItem2)

})
}
