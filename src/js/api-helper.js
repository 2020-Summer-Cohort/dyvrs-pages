export {
    fetchCategory
}

const fetchCategory = async (id) => {
    return fetch('http://localhost:8080/api/category/{id}')
        .then(response => response.json())
}