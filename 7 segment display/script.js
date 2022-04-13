var top1=document.getElementById('x1');
var top2=document.getElementById('x2');
var top3=document.getElementById('x3');
var bot1=document.getElementById('y1');
var bot2=document.getElementById('y2');
var bot3=document.getElementById('y3');
var t_f=[0,0,0];
var number=0;
//adding function-----------------------------------------------

function add(){
	number++;
	disp(number);
}
//subrating function----------------------------------------------

function sub(){
	number--;
	disp(number);
}
//display function calling------------------------------------------------


function disp(x){
   if(x<10 && x>=0){	
    t_f=[0,0,0];
    document.getElementById('simpol').style.display="none";
   numberdisplay3(x);  
   numberdisplay2(t_f[1]);
   numberdisplay1(t_f[2]); 		  
    }
   if(x>=10 && x<1000){
    for(var i=0;i<3;i++){
        t_f[i]=x%10;
        x=Math.floor(x/10);
    }
    numberdisplay3(t_f[0]);
    numberdisplay2(t_f[1]);
    numberdisplay1(t_f[2]);

   } 
   
//dispalying negative numbers------------------------------------------------
    if(x<0 && x>-10){
        x*=(-1);
        console.log(x); 
        document.getElementById('simpol').style.display="block";
        numberdisplay3(x);
    }
    if(x<=-10 && x>-1000){
        x*=(-1);
        document.getElementById('simpol').style.display="block";

    for(i=0;i<3;i++){
        t_f[i]=x%10;
        x=Math.floor(x/10);
    }
        numberdisplay3(t_f[0]);
        numberdisplay2(t_f[1]);
        numberdisplay1(t_f[2]);
   }
  }

   





//Displaying number 3rd digit code---------------------------------------------------

function numberdisplay3(y){
     switch(y){
            case 1:case -1:
              
              top3.style.borderRight="25px solid blue";
              top3.style.borderLeft="none";
              top3.style.borderTop="none";
              top3.style.borderBottom="none";

              bot3.style.borderRight="25px solid blue";
              bot3.style.borderBottom="none";
              bot3.style.borderLeft="none";
              bot3.style.borderTop="none";
              break;
            case 2: case-2:
              top3.style.borderRight="25px solid blue";
              top3.style.borderLeft="none";
              top3.style.borderTop="25px solid blue";
              top3.style.borderBottom="25px solid blue";

              bot3.style.borderRight="none";
              bot3.style.borderBottom="25px solid blue";
              bot3.style.borderLeft="25px solid blue";
              bot3.style.borderTop="none";
              break;
             case 3:case -3:
              top3.style.borderRight="25px solid blue";
              top3.style.borderLeft="none";
              top3.style.borderTop="25px solid blue";
              top3.style.borderBottom="25px solid blue";

              bot3.style.borderRight="25px solid blue";
              bot3.style.borderBottom="25px solid blue";
              bot3.style.borderLeft="none";
              bot3.style.borderTop="none";
              break;
              case 4:case -4:
               top3.style.borderRight="25px solid blue";
               top3.style.borderLeft="25px solid blue";
               top3.style.borderTop="none";
               top3.style.borderBottom="25px solid blue";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="none";
               bot3.style.borderLeft="none";
               bot3.style.borderTop="none";
               break;
               case 5:case -5:
               top3.style.borderRight="none";
               top3.style.borderLeft="25px solid blue";
               top3.style.borderTop="25px solid blue";
               top3.style.borderBottom="25px solid blue";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="25px solid blue";
               bot3.style.borderLeft="none";
               bot3.style.borderTop="none";
               break;
               case 6 :case -6:
               top3.style.borderRight="none";
               top3.style.borderLeft="25px solid blue";
               top3.style.borderTop="25px solid blue";
               top3.style.borderBottom="25px solid blue";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="25px solid blue";
               bot3.style.borderLeft="25px solid blue";
               bot3.style.borderTop="none";
               break;
               case 7:case -7:
               top3.style.borderRight="25px solid blue";
               top3.style.borderLeft="none";
               top3.style.borderTop="25px solid blue";
               top3.style.borderBottom="none";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="none";
               bot3.style.borderLeft="none";
               bot3.style.borderTop="none";
               break;
               case 8:case -8:
               top3.style.borderRight="25px solid blue";
               top3.style.borderLeft="25px solid blue";
               top3.style.borderTop="25px solid blue";
               top3.style.borderBottom="25px solid blue";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="25px solid blue";
               bot3.style.borderLeft="25px solid blue";
               bot3.style.borderTop="none";
               break;
               case 9:case -9:
               top3.style.borderRight="25px solid blue";
               top3.style.borderLeft="25px solid blue";
               top3.style.borderTop="25px solid blue";
               top3.style.borderBottom="25px solid blue";

               bot3.style.borderRight="25px solid blue";
               bot3.style.borderBottom="none";
               bot3.style.borderLeft="none";
               bot3.style.borderTop="none";
               break;
               default:
              top3.style.borderRight="25px solid blue";
              top3.style.borderLeft="25px solid blue";
              top3.style.borderTop="25px solid blue";
              top3.style.borderBottom="none";

              bot3.style.borderRight="25px solid blue";
              bot3.style.borderBottom="25px solid blue";
              bot3.style.borderLeft="25px solid blue";
              bot3.style.borderTop="none";
              break;
   }
}

//Displaying number 2nd digit code------------------------------------------------------

function numberdisplay2(p){
     switch(p){
            case 1:case -1:
            
              top2.style.borderRight="25px solid blue";
              top2.style.borderLeft="none";
              top2.style.borderTop="none";
              top2.style.borderBottom="none";

              bot2.style.borderRight="25px solid blue";
              bot2.style.borderBottom="none";
              bot2.style.borderLeft="none";
              bot2.style.borderTop="none";
              break;
            case 2:case -2:
              top2.style.borderRight="25px solid blue";
              top2.style.borderLeft="none";
              top2.style.borderTop="25px solid blue";
              top2.style.borderBottom="25px solid blue";

              bot2.style.borderRight="none";
              bot2.style.borderBottom="25px solid blue";
              bot2.style.borderLeft="25px solid blue";
              bot2.style.borderTop="none";
              break;
             case 3:case -3:
              top2.style.borderRight="25px solid blue";
              top2.style.borderLeft="none";
              top2.style.borderTop="25px solid blue";
              top2.style.borderBottom="25px solid blue";

              bot2.style.borderRight="25px solid blue";
              bot2.style.borderBottom="25px solid blue";
              bot2.style.borderLeft="none";
              bot2.style.borderTop="none";
              break;
              case 4:case -4:
               top2.style.borderRight="25px solid blue";
               top2.style.borderLeft="25px solid blue";
               top2.style.borderTop="none";
               top2.style.borderBottom="25px solid blue";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="none";
               bot2.style.borderLeft="none";
               bot2.style.borderTop="none";
               break;
               case 5:case -5:
               top2.style.borderRight="none";
               top2.style.borderLeft="25px solid blue";
               top2.style.borderTop="25px solid blue";
               top2.style.borderBottom="25px solid blue";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="25px solid blue";
               bot2.style.borderLeft="none";
               bot2.style.borderTop="none";
               break;
               case 6:case -6:
               top2.style.borderRight="none";
               top2.style.borderLeft="25px solid blue";
               top2.style.borderTop="25px solid blue";
               top2.style.borderBottom="25px solid blue";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="25px solid blue";
               bot2.style.borderLeft="25px solid blue";
               bot2.style.borderTop="none";
               break;
               case 7:case -7:
               top2.style.borderRight="25px solid blue";
               top2.style.borderLeft="none";
               top2.style.borderTop="25px solid blue";
               top2.style.borderBottom="none";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="none";
               bot2.style.borderLeft="none";
               bot2.style.borderTop="none";
               break;
               case 8:case -8:
               top2.style.borderRight="25px solid blue";
               top2.style.borderLeft="25px solid blue";
               top2.style.borderTop="25px solid blue";
               top2.style.borderBottom="25px solid blue";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="25px solid blue";
               bot2.style.borderLeft="25px solid blue";
               bot2.style.borderTop="none";
               break;
               case 9:case -9:
               top2.style.borderRight="25px solid blue";
               top2.style.borderLeft="25px solid blue";
               top2.style.borderTop="25px solid blue";
               top2.style.borderBottom="25px solid blue";

               bot2.style.borderRight="25px solid blue";
               bot2.style.borderBottom="none";
               bot2.style.borderLeft="none";
               bot2.style.borderTop="none";
               break;
               default:
              top2.style.borderTop="25px solid blue";
              top2.style.borderRight="25px solid blue";
              top2.style.borderLeft="25px solid blue";
              top2.style.borderBottom="none";

              bot2.style.borderBottom="25px solid blue";
              bot2.style.borderRight="25px solid blue";
              bot2.style.borderLeft="25px solid blue";
              bot2.style.borderTop="none";
              
              break;
   }
}

//Displaying number 1st digit code-------------------------------------------------------

function numberdisplay1(s){
     switch(s){
            case 1:case -1:
              
              top1.style.borderRight="25px solid blue";
              top1.style.borderLeft="none";
              top1.style.borderTop="none";
              top1.style.borderBottom="none";

              bot1.style.borderRight="25px solid blue";
              bot1.style.borderBottom="none";
              bot1.style.borderLeft="none";
              bot1.style.borderTop="none";
              break;
            case 2:case -2:
              top1.style.borderRight="25px solid blue";
              top1.style.borderLeft="none";
              top1.style.borderTop="25px solid blue";
              top1.style.borderBottom="25px solid blue";

              bot1.style.borderRight="none";
              bot1.style.borderBottom="25px solid blue";
              bot1.style.borderLeft="25px solid blue";
              bot1.style.borderTop="none";
              break;
             case 3:case -3:
              top1.style.borderRight="25px solid blue";
              top1.style.borderLeft="none";
              top1.style.borderTop="25px solid blue";
              top1.style.borderBottom="25px solid blue";

              bot1.style.borderRight="25px solid blue";
              bot1.style.borderBottom="25px solid blue";
              bot1.style.borderLeft="none";
              bot1.style.borderTop="none";
              break;
              case 4:case -4:
               top1.style.borderRight="25px solid blue";
               top1.style.borderLeft="25px solid blue";
               top1.style.borderTop="none";
               top1.style.borderBottom="25px solid blue";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="none";
               bot1.style.borderLeft="none";
               bot1.style.borderTop="none";
               break;
               case 5:case -5:
               top1.style.borderRight="none";
               top1.style.borderLeft="25px solid blue";
               top1.style.borderTop="25px solid blue";
               top1.style.borderBottom="25px solid blue";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="25px solid blue";
               bot1.style.borderLeft="none";
               bot1.style.borderTop="none";
               break;
               case 6:case -6:
               top1.style.borderRight="none";
               top1.style.borderLeft="25px solid blue";
               top1.style.borderTop="25px solid blue";
               top1.style.borderBottom="25px solid blue";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="25px solid blue";
               bot1.style.borderLeft="25px solid blue";
               bot1.style.borderTop="none";
               break;
               case 7:case -7:
               top1.style.borderRight="25px solid blue";
               top1.style.borderLeft="none";
               top1.style.borderTop="25px solid blue";
               top1.style.borderBottom="none";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="none";
               bot1.style.borderLeft="none";
               bot1.style.borderTop="none";
               break;
               case 8:case -8:
               top1.style.borderRight="25px solid blue";
               top1.style.borderLeft="25px solid blue";
               top1.style.borderTop="25px solid blue";
               top1.style.borderBottom="25px solid blue";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="25px solid blue";
               bot1.style.borderLeft="25px solid blue";
               bot1.style.borderTop="none";
               break;
               case 9:case -9:
               top1.style.borderRight="25px solid blue";
               top1.style.borderLeft="25px solid blue";
               top1.style.borderTop="25px solid blue";
               top1.style.borderBottom="25px solid blue";

               bot1.style.borderRight="25px solid blue";
               bot1.style.borderBottom="none";
               bot1.style.borderLeft="none";
               bot1.style.borderTop="none";
               break;
               default:
              top1.style.borderTop="25px solid blue";
              top1.style.borderRight="25px solid blue";
              top1.style.borderLeft="25px solid blue";
              top1.style.borderBottom="none";

              bot1.style.borderBottom="25px solid blue";
              bot1.style.borderRight="25px solid blue";
              bot1.style.borderLeft="25px solid blue";
              bot1.style.borderTop="none";
              
              break;
   }
}