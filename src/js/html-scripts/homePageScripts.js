import { renderHeader } from '../components/header.js'
import { renderFooter } from '../components/footer.js'
renderHeader();
renderFooter();
import{renderSpotlightOne, renderCategoryCircle} from '../components/home-page.js'
import { fetchCat1 } from '../fetch-api.js'
renderSpotlightOne();
renderCategoryCircle();
const id1 = document.querySelector(`.id1`);
console.log(id1);
id1.addEventListener("click", ()=> {
     fetchCat1();
})