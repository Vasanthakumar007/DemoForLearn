// border-top-left-radius: 2rem;
// border-top-right-radius: 2rem;
// border-bottom-left-radius: 2rem;
// border-bottom-right-radius: 2rem;
/*Below for Stop watch*/
var sos;
var sos1;
var sos2;
var hour=0;
var min=0;
var sec=1;
var h1=document.getElementById('hr1');
var h2=document.getElementById('hr2');
var h3=document.getElementById('hr3');
var h4=document.getElementById('hr4');
var m1=document.getElementById('min1');
var m2=document.getElementById('min2');
var m3=document.getElementById('min3');
var m4=document.getElementById('min4');
var s1=document.getElementById('sec1');
var s2=document.getElementById('sec2');
var s3=document.getElementById('sec3');
var s4=document.getElementById('sec4');
function stopwatch(){
    document.getElementById('startbutton').style.display="inline";
    document.getElementById('stopbutton').style.display="inline";
    document.getElementById('ST').style.backgroundColor="brown";
    document.getElementById('clock').style.backgroundColor="black";
    document.getElementById('timer').style.backgroundColor="black";
    reset();
    clearInterval(sos1);
    clearInterval(sos2);

}
function reset(){
    single(0);
    double(0);
    msingle(0);
    mdouble(0);
    hsingle(0);
    hdouble(0);
}
function start(){
      if(sec==60){
        sec=0;
        min+=1;
      }
      if(min==60){
        min=0;
        hour+=1;
      }

    changeDisplay(sec,min,hour);
    sec++;
}


function changeDisplay(x,y,z){

    if(x<10){
        single(x);
        double(0);
    }
    if(x>=10){
        var arr=[0,0];
        arr[0]=x%10;
        arr[1]=Math.floor(x/10);
        single(arr[0]);  
        double(arr[1]);
    }
    if(y<10){
        msingle(y);
        mdouble(0);
    }
    if(y>=10){
       var arr=[0,0];
        arr[0]=y%10;
        arr[1]=Math.floor(y/10);
        msingle(arr[0]);  
        mdouble(arr[1]);
    }
    if(z<10){
        hsingle(z);
        hdouble(0);
    }
    if(z>=10){
       var arr=[0,0];
        arr[0]=z%10;
        arr[1]=Math.floor(z/10);
        hsingle(arr[0]);  
        hdouble(arr[1]);
    }
}


function single(x){
    switch(x){
        case 1:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="none";
              s2.style.borderTop="none";
              s2.style.borderBottom="none";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="none";
              s4.style.borderLeft="none";
              s4.style.borderTop="none"; 
              break;
        case 2:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="none";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="none";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="20px solid brown";
              s4.style.borderTop="none";    
              break;
        case 3:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="none";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="none";
              s4.style.borderTop="none";    
              break;      
        case 4:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="none";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="none";
              s4.style.borderLeft="none";
              s4.style.borderTop="none";    
              break;      
        case 5:
              s2.style.borderRight="none";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="none";
              s4.style.borderTop="none";    
              break;
        case 6:
              s2.style.borderRight="none";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="20px solid brown";
              s4.style.borderTop="none";    
              break;
        case 7:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="none";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="none";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="none";
              s4.style.borderLeft="none";
              s4.style.borderTop="none";    
              break;  
        case 8:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="20px solid brown";
              s4.style.borderTop="none";    
              break;                      
        case 9:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="20px solid brown";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="none";
              s4.style.borderTop="none";    
              break;      
        default:
              s2.style.borderRight="20px solid brown";
              s2.style.borderLeft="20px solid brown";
              s2.style.borderTop="20px solid brown";
              s2.style.borderBottom="none";

              s4.style.borderRight="20px solid brown";
              s4.style.borderBottom="20px solid brown";
              s4.style.borderLeft="20px solid brown";
              s4.style.borderTop="none";    
              break;
    }
}
function double(x){
    

     switch(x){
        case 1:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="none";
              s1.style.borderTop="none";
              s1.style.borderBottom="none";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="none";
              s3.style.borderLeft="none";
              s3.style.borderTop="none"; 
              break;
        case 2:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="none";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="none";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="20px solid brown";
              s3.style.borderTop="none";    
              break;
        case 3:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="none";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="none";
              s3.style.borderTop="none";    
              break;      
        case 4:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="none";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="none";
              s3.style.borderLeft="none";
              s3.style.borderTop="none";    
              break;      
        case 5:
              s1.style.borderRight="none";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="none";
              s3.style.borderTop="none";    
              break;
        case 6:
              s1.style.borderRight="none";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="20px solid brown";
              s3.style.borderTop="none";    
              break;
        case 7:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="none";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="none";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="none";
              s3.style.borderLeft="none";
              s3.style.borderTop="none";    
              break;  
        case 8:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="20px solid brown";
              s3.style.borderTop="none";    
              break;                      
        case 9:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="20px solid brown";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="none";
              s3.style.borderTop="none";    
              break;  
        default:
              s1.style.borderRight="20px solid brown";
              s1.style.borderLeft="20px solid brown";
              s1.style.borderTop="20px solid brown";
              s1.style.borderBottom="none";

              s3.style.borderRight="20px solid brown";
              s3.style.borderBottom="20px solid brown";
              s3.style.borderLeft="20px solid brown";
              s3.style.borderTop="none";    
              break;           
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////


function msingle(x){
    switch(x){
        case 1:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="none";
              m2.style.borderTop="none";
              m2.style.borderBottom="none";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="none";
              m4.style.borderLeft="none";
              m4.style.borderTop="none"; 
              break;
        case 2:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="none";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="none";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="20px solid brown";
              m4.style.borderTop="none";    
              break;
        case 3:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="none";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="none";
              m4.style.borderTop="none";    
              break;      
        case 4:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="none";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="none";
              m4.style.borderLeft="none";
              m4.style.borderTop="none";    
              break;      
        case 5:
              m2.style.borderRight="none";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="none";
              m4.style.borderTop="none";    
              break;
        case 6:
              m2.style.borderRight="none";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="20px solid brown";
              m4.style.borderTop="none";    
              break;
        case 7:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="none";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="none";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="none";
              m4.style.borderLeft="none";
              m4.style.borderTop="none";    
              break;  
        case 8:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="20px solid brown";
              m4.style.borderTop="none";    
              break;                      
        case 9:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="20px solid brown";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="none";
              m4.style.borderTop="none";    
              break;      
        default:
              m2.style.borderRight="20px solid brown";
              m2.style.borderLeft="20px solid brown";
              m2.style.borderTop="20px solid brown";
              m2.style.borderBottom="none";

              m4.style.borderRight="20px solid brown";
              m4.style.borderBottom="20px solid brown";
              m4.style.borderLeft="20px solid brown";
              m4.style.borderTop="none";    
              break;
    }
}
function mdouble(x){
    

     switch(x){
        case 1:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="none";
              m1.style.borderTop="none";
              m1.style.borderBottom="none";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="none";
              m3.style.borderLeft="none";
              m3.style.borderTop="none"; 
              break;
        case 2:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="none";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="none";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="20px solid brown";
              m3.style.borderTop="none";    
              break;
        case 3:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="none";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="none";
              m3.style.borderTop="none";    
              break;      
        case 4:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="none";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="none";
              m3.style.borderLeft="none";
              m3.style.borderTop="none";    
              break;      
        case 5:
              m1.style.borderRight="none";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="none";
              m3.style.borderTop="none";    
              break;
        case 6:
              m1.style.borderRight="none";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="20px solid brown";
              m3.style.borderTop="none";    
              break;
        case 7:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="none";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="none";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="none";
              m3.style.borderLeft="none";
              m3.style.borderTop="none";    
              break;  
        case 8:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="20px solid brown";
              m3.style.borderTop="none";    
              break;                      
        case 9:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="20px solid brown";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="none";
              m3.style.borderTop="none";    
              break;  
        default:
              m1.style.borderRight="20px solid brown";
              m1.style.borderLeft="20px solid brown";
              m1.style.borderTop="20px solid brown";
              m1.style.borderBottom="none";

              m3.style.borderRight="20px solid brown";
              m3.style.borderBottom="20px solid brown";
              m3.style.borderLeft="20px solid brown";
              m3.style.borderTop="none";    
              break;           
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////

function hsingle(x){
    switch(x){
        case 1:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="none";
              h2.style.borderTop="none";
              h2.style.borderBottom="none";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="none";
              h4.style.borderLeft="none";
              h4.style.borderTop="none"; 
              break;
        case 2:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="none";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="none";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="20px solid brown";
              h4.style.borderTop="none";    
              break;
        case 3:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="none";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="none";
              h4.style.borderTop="none";    
              break;      
        case 4:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="none";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="none";
              h4.style.borderLeft="none";
              h4.style.borderTop="none";    
              break;      
        case 5:
              h2.style.borderRight="none";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="none";
              h4.style.borderTop="none";    
              break;
        case 6:
              h2.style.borderRight="none";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="20px solid brown";
              h4.style.borderTop="none";    
              break;
        case 7:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="none";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="none";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="none";
              h4.style.borderLeft="none";
              h4.style.borderTop="none";    
              break;  
        case 8:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="20px solid brown";
              h4.style.borderTop="none";    
              break;                      
        case 9:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="20px solid brown";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="none";
              h4.style.borderTop="none";    
              break;      
        default:
              h2.style.borderRight="20px solid brown";
              h2.style.borderLeft="20px solid brown";
              h2.style.borderTop="20px solid brown";
              h2.style.borderBottom="none";

              h4.style.borderRight="20px solid brown";
              h4.style.borderBottom="20px solid brown";
              h4.style.borderLeft="20px solid brown";
              h4.style.borderTop="none";    
              break;
    }
}
function hdouble(x){
    

     switch(x){
        case 1:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="none";
              h1.style.borderTop="none";
              h1.style.borderBottom="none";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="none";
              h3.style.borderLeft="none";
              h3.style.borderTop="none"; 
              break;
        case 2:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="none";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="none";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="20px solid brown";
              h3.style.borderTop="none";    
              break;
        case 3:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="none";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="none";
              h3.style.borderTop="none";    
              break;      
        case 4:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="none";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="none";
              h3.style.borderLeft="none";
              h3.style.borderTop="none";    
              break;      
        case 5:
              h1.style.borderRight="none";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="none";
              h3.style.borderTop="none";    
              break;
        case 6:
              h1.style.borderRight="none";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="20px solid brown";
              h3.style.borderTop="none";    
              break;
        case 7:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="none";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="none";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="none";
              h3.style.borderLeft="none";
              h3.style.borderTop="none";    
              break;  
        case 8:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="20px solid brown";
              h3.style.borderTop="none";    
              break;                      
        case 9:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="20px solid brown";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="none";
              h3.style.borderTop="none";    
              break;  
        default:
              h1.style.borderRight="20px solid brown";
              h1.style.borderLeft="20px solid brown";
              h1.style.borderTop="20px solid brown";
              h1.style.borderBottom="none";

              h3.style.borderRight="20px solid brown";
              h3.style.borderBottom="20px solid brown";
              h3.style.borderLeft="20px solid brown";
              h3.style.borderTop="none";    
              break;           
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////


function s(){
    sos=setInterval(start,1000);
}
function st(){
    clearInterval(sos);
}

/*Below is for Current clock*/
var notify=document.getElementById('play');
function clock(){
        clocker();
        document.getElementById("startbutton").style.display="none";
        document.getElementById("stopbutton").style.display="none";
        document.getElementById("clock").style.backgroundColor="brown";
        document.getElementById('ST').style.backgroundColor="black";
        document.getElementById('timer').style.backgroundColor="black";

         sos1=setInterval(clocker,1000);
         clearInterval(sos);
         clearInterval(sos2);
       
}
function clocker(){
    var date=new Date();
    var c_hour=date.getHours();
    var c_min=date.getMinutes();
    var c_sec=date.getSeconds();
      if(c_hour>12){
        c_hour=c_hour-12;
      }
        var arr=[0,0];
        arr[0]=c_hour%10;
        arr[1]=Math.floor(c_hour/10);
        hsingle(arr[0]);  
        hdouble(arr[1]);
        var arr1=[0,0];
        arr1[0]=c_min%10;
        arr1[1]=Math.floor(c_min/10);
        msingle(arr1[0]);
        mdouble(arr1[1]);
        var arr2=[0,0];
        arr2[0]=c_sec%10;
        arr2[1]=Math.floor(c_sec/10);
        single(arr2[0]);
        double(arr2[1]);
}

/*Below is for Timer*/

function timer(){
    reset();
    document.getElementById('startbutton').style.display="none";
    document.getElementById('stopbutton').style.display="none";
    document.getElementById('timer').style.backgroundColor="brown";
    document.getElementById('ST').style.backgroundColor="black";
    document.getElementById('clock').style.backgroundColor="black";
    clearInterval(sos1);
    clearInterval(sos);
    timeseter();

}
function timeseter() {
    while(true){
        hour=prompt("Enter the Hour");
        min=prompt("Enter the Min");
        sec=prompt("Enter the sec");
        if(hour<=12 && min<=59 && sec<=59){
            break;
        }
    }
     set();
     sos2=setInterval(set,1000);

}

function set(){
    if(sec==0 && min>0){
        sec=59;
        min-=1;
      }
      if(min==0 && hour>0){
        min=59;
        hour-=1;
      }

    changeDisplay(sec,min,hour);
    sec--;
    if(sec==-1 && min==0 && hour==0){
        console.log(sec);
        notify.volume = 1;
        notify.play();
        clearInterval(sos2);
    }
}