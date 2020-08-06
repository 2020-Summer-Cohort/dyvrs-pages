export {
    renderHeader
}

// const renderHeader = () => {
//     const header = document.createElement('header');
//     header.classList.add('header');
//     const head = document.querySelector('head');
//     header.innerHTML = `
//     <h1 class="header__logo"><a href="./index.html">Dyvrs Pages</a></h1>
//     <nav class="header__nav">
//         <ul class= "header__container">
//             <li class="header__list-item">Businesses</li>
//             <li class="header__list-item"><a href="./about.html">About Us</a></li>
//             <li class="header__list-item"><a href="./newUserForm.html">Create Account</a></li>
//             <li class="header__list-item"><a href="./userUpdate-longIn.html">Log In</a></li>
//         </ul>
//     </nav>
//     `
//     return head.appendChild(header);
// }
// Scratch work

console.log('hello first');
const renderHeader = () => {
    const header = document.createElement('header');
    header.classList.add('header');
    header.innerHTML = `
    <h1 class="header__logo"><a href="./index.html">Dyvrs Pages</a></h1>
    <nav class="header__nav">
        <ul class= "header__container">
            <li class="header__list-item">Businesses</li>
            <li class="header__list-item"><a href="./about.html">About Us</a></li>
            <li class="header__list-item"><a href="./newUserForm.html">Create Account</a></li>
            <li class="header__list-item"><a href="./userUpdate-longIn.html">Log In</a></li>
        </ul>
    </nav>
    `
    console.log('hello inside');
    const body = document.querySelector('.main');
    body.prepend(header);
}