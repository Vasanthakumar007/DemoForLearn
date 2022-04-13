var com=document.getElementById('computer');
var original=document.getElementById('physical');
var count=1;
var ans0;
var score1=0;
var score2=0;



function rock(){
	if(count<6){
		original.style.backgroundImage="url('1.png')";
        ans0=1;
        count++;
        play();
	}
	if(count===6){
       win();
       restart();
	}
   
}
function paper(){
   if(count<6){
   original.style.backgroundImage="url('2.png')";
   ans0=2;
   play();
   count++;
   }
   if(count===6){
       win();
       restart();
	}
}
function scissor(){
   if(count<6){
   original.style.backgroundImage="url('3.png')";
   ans0=3;
   play();
   count++;
   }
   if(count===6){
       win();
       restart();
	}
}
function play(){
	var ans=Math.floor(Math.random() * (4 - 1) + 1);
	console.log(ans);
	disp2(ans);
	cal(ans0,ans);

}
function disp2(x){
	switch(x){
		case 1:
		   com.style.backgroundImage="url('1.png')";break;
		case 2:  
		   com.style.backgroundImage="url('2.png')";break;
		case 3:
		   com.style.backgroundImage="url('3.png')";break; 

	}


}


function cal(s,t){ 
  if(s==1 && t===2){
  	score2++;
  }
  if(s===1 && t===3){
  	score1++;
  }
  if(s===2 && t===1){
  	score1++;
  }  
  if(s===2 && t===3){
  	score2++;
  }
  if(s===3 && t===1){
  	score2++;
  }
  if(s===3 && t===2){
  	score1++;	
  }
  document.getElementById('dis1').innerText=score1;
  document.getElementById('dis2').innerText=score2;
  
}



function restart(){
	count=1;
	score2=0;
	score1=0;
	document.getElementById('dis1').innerText=score1;
    document.getElementById('dis2').innerText=score2;
}
 function win(d,c){
 	if(d<c){
 		alert("player2 win !!!!");
 	}else if(d>c){
 		alert("player1 win !!!");
 	}else{
 		alert("Match in Draw !!!");
 	}
 }

// function scoredisplay(a,b){
// 	document.getElementById('dis1').innerHTML=a;
// 	document.getElementById('dis2').innerHTML=b;
// }