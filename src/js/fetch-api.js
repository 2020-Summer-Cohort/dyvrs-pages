export {
    fetchCategory,
    fetchStore,
    fetchTeam
}

const fetchCategory = async (id) => {
    return fetch('http://localhost:8080/api/category/{id}')
        .then(response => response.json())
}

const fetchStore = async (id) => {
    return fetch('http://localhost:8080/api/stores/{id}')
        .then(response => response.json())
}

const fetchTeam = async (id) => {
    return fetch('http://localhost:8080/api/team/{id}')
        .then(response => response.json())
}