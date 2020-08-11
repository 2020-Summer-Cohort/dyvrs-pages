export {
    renderFooter
}
const renderFooter = () => {
    const footer = document.createElement('footer');
    footer.classList.add('footer');
    footer.innerHTML = `
        <nav class="footer__nav">
            <ul class="footer__container">
                <li class="footer__list-item"><a href="./contactUs.html">Contact Us</a></li>
                <li class="header__list-item"><a href="./businessOwnerPage.html">Owner Portal</a></li>
                <li class="footer__list-item"><a href="./team.html">Team</a></li>
                <li class="footer__list-item"><a href="./suggestion .html">Suggestions</a></li>
                <li class="footer__list-item"><a href="./categories.html">Categories</a></li>
            </ul>
        </nav>
        <div class="footer__copyright">&copy;Dyvrs Pages</div>
    `;
    console.log('hello inside');
    const body = document.querySelector('.main');
    body.appendChild(footer);
}