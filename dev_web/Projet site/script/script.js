function changeBackgroundColor() {

var color = prompt("Entrez une couleur en Anglais (ex. red, blue, green) :");
document.body.style.backgroundColor = color;
}

function changeBackgroundImage() {
var imageUrl = prompt("Entrez l'URL de l'image à utiliser en fond :");
document.body.style.backgroundImage = "url(" + imageUrl + ")";
}