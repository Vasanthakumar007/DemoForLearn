
let cardArray = [ 
{ name: "1", img: "fries.png", }, 
{ name: "2", img: "cheeseburger.jpeg", },
{ name: "3", img: "hotdog.jpeg", }, 
{ name: "4", img: "ice-cream.jpeg", },
{name:"5",img:"milkshake.jpeg"},
{name:"6",img:"pizza.jpeg"},
{ name: "1", img: "fries.png", }, 
{ name: "2", img: "cheeseburger.jpeg", },
{ name: "3", img: "hotdog.jpeg", }, 
{ name: "4", img: "ice-cream.jpeg", },
{name:"5",img:"milkshake.jpeg"},
{name:"6",img:"pizza.jpeg"}
 // Create a array of object literals of the images to be shown like the above
]; 

//define variables and get DOM element

let grid = document.querySelector(".grid"); 
let scoreBoard = document.querySelector(".scoreBoard"); 
let popup = document.querySelector(".popup"); 
let playAgain = document.querySelector(".playAgain"); 
let clickBoard = document.querySelector(".clickBoard"); 
let imgs; 
let cardsId = []; 
let cardsSelected = []; 
let cardsWon = 0; 
let clicks = 0;
let score=0;

// Starter Method call

document.addEventListener("DOMContentLoaded", function () {

	//define functions 
	arrangeCard(cardArray);
	createBoard(grid, cardArray); 
	
	playAgain.addEventListener("click", replay); 

	//add a click function for images 

	imgs = document.querySelectorAll("img");
	Array.from(imgs).forEach(img => 
	img.addEventListener("click", flipCard)
) 
});


//createBoard function
function createBoard(grid, array) { 
popup.style.display = "none"; 
document.getElementById('won').style.display="none";
console.log(array);
array.forEach((arr, index) => { 
let img = document.createElement("img"); 
img.setAttribute("src", "blank.png");
img.setAttribute("data-id", index); 
grid.appendChild(img); 
});

}

// arrangeCard function


function arrangeCard(array) { 
	for(var i=0;i<10;i++){
		var temp1=Math.floor(Math.random()*(5-0)+0);
			var temp2=Math.floor(Math.random()*(12-7)+7);
			var temp=array[temp1];
			array[temp1]=array[temp2];
			array[temp2]=temp;
	}
		//arrange the cards in a shuffled order
}


// flip Card function


function flipCard() { 
	let selected = this.dataset.id;
	cardsSelected.push(cardArray[selected].name); 
	cardsId.push(selected); 
	this.classList.add("flip"); 
	setTimeout(()=>{
		this.setAttribute("src", cardArray[selected].img); 
	},200);
	if (cardsId.length === 2) { 
	setTimeout(checkForMatch, 500);
	} 
}




// checkForMatch function

function checkForMatch() { 
console.log(cardsSelected);
     if(cardsSelected[0]==cardsSelected[1]){
		 score++;
		 scoreBoard.textContent=score;
		 console.log("same found");
	 }else{
         console.log("not same");
		 var x="[data-id='"+cardsId[0]+"']";
		 var x1="[data-id='"+cardsId[1]+"']";
		 setTimeout(()=>{
			document.querySelector(x).src="blank.png";
			document.querySelector(x1).src="blank.png";
			document.querySelector(x1).classList.remove("flip");
			document.querySelector(x).classList.remove("flip");
		 },1000);
	 }
	 clicks++;
	 clickBoard.textContent=clicks;
	 cardsSelected.length=0;
	 cardsId.length=0;
	 if(score==6){
		 checkWon();
	 }
		//your code
}


// checkWon function
function checkWon() {
	popup.style.display="flex";
    document.getElementById('won').style.display="block";
    // setTimeout(()=>{window.location=window.location},1500);
		//your code

}


//replay function
function replay() { 
grid.innerHTML = "";
cardsWon = 0;
clicks = 0; 
score=0;
clickBoard.textContent = 0; 
scoreBoard.textContent = 0; 
popup.style.display = "none"; 	
arrangeCard(cardArray);
createBoard(grid, cardArray);
imgs = document.querySelectorAll("img");
	Array.from(imgs).forEach(img => 
	img.addEventListener("click", flipCard));

}

