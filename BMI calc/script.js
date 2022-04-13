var inp1=document.getElementById("inph");
var inp2=document.getElementById("inpw");
var out1=document.getElementById("out");
var out2=document.getElementById("outvalue");



function calculate(){
	var x=(inp2.value/((inp1.value/100)*(inp1.value/100)));
	out1.value=x;
    disp(x);
}

function disp(i){
    if(i<18.5){
       out2.innerText="Under weight!";
    }else if(i>=18.5 && i<24.9){
       out2.innerText="Healthy weight";
    }else if(i>=24.9 && i<30){
       out2.innerText="Overweight!";
    }else if(i>=30){
       out2.innerText="Obesity!";
    }
}