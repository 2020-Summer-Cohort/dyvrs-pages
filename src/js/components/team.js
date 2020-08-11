import{fetchTeam}from "../fetch-api.js"

export{renderTeam}

console.log("calling Team.js correctly")
const renderTeam = (id) => {
    fetchTeam(id).then(team => {
        const ul = document.createElement('ul');
        ul.classList.add("team__ul_container")

        console.log("inside RenderTeam")

       team.teamMember.forEach(teamMember => {
        const li = document.createElement('li');
        li.classList.add("team__item")
        li.innerHTML = `<img>
        <div>${teamMember.name}</div>
        <div class =pic> </div>
        <div class = funfact> ${teamMember.funFacts}</div>
        <a class = linkedin  href="${teamMember.linkedIn} target ="_blank"> lorem ipsum </a>
        </li>`
        ul.appendChild(li);
        console.log("inside line 23");
    })

    const h2 = document.querySelector('.team__title')
    h2.innerHTML = teamMember.name;
    h2.appendChild(ul);
}
)}

