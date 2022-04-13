var player1=document.getElementById("die1");
var player2=document.getElementById("die2");
var dei1=document.getElementById("roll1");
var dei2=document.getElementById("roll2");
var table=document.getElementById("table");
var playerwon1=document.getElementById("player1won");	
var playerwon2=document.getElementById("player2won");
var num1,num2,x,y,player1count,player2count;
var times1=0;
var times2=0;
var player1score=[];
var player2score=[];
var ans1=0;
var ans2=0;
function player1roll(){
       num1=Math.floor(Math.random() * 6) + 1;
       player1score.push(num1);
       rotate1(num1);
       times1++;
       if(times1==5){
       dei1.style.display="none";
       }
}
function player2roll(){
	num2=Math.floor(Math.random() * 6) + 1;
	   player2score.push(num2);
       rotate2(num2);
       times2++;
       if(times2==5){
       dei2.style.display="none";
       }
}
function rotate1(x){
  switch(x){
  	case 1:player1.style.transform="rotatex(360deg)";break;
  	case 2:player1.style.transform="rotatey(180deg)";break;
  	case 3:player1.style.transform="rotatey(90deg)";break;
  	case 4:player1.style.transform="rotatey(270deg)";break;
  	case 5:player1.style.transform="rotatex(270deg)";break;
  	case 6:player1.style.transform="rotatex(90deg)";break;
  }
}
function rotate2(y){
  switch(y){
  	case 1:player2.style.transform="rotatex(360deg)";break;
  	case 2:player2.style.transform="rotatey(180deg)";break;
  	case 3:player2.style.transform="rotatey(90deg)";break;
  	case 4:player2.style.transform="rotatey(270deg)";break;
  	case 5:player2.style.transform="rotatex(270deg)";break;
  	case 6:player2.style.transform="rotatex(90deg)";break;
  }
}
function check(s,t){
   display(s,t);

   
   for(i=0;i<s.length;i++){
   	ans1+=s[i];

   }
   

   for(i=0;i<t.length;i++){
   	ans2+=t[i];
   }
   

   if(ans1>ans2){
   	playerwon1.style.display="flex";
   }
   else if(ans1<ans2){
   playerwon2.style.display="flex";
   }
   
}
function display(s,t){
	if(s.length==5 && t.length==5){
	for(var i=0;i<s.length;i++){
    table.innerHTML+="<tr><td>"+s[i]+"</td><td>"+t[i]+"</td></tr>";
      }

    }
}
