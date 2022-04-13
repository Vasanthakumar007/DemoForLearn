var fills=document.querySelectorAll('.fill');
var layout1=[0,1,2,3,4,1,2,3,4,0,2,3,4,0,1,3,4,0,1,2,4,0,1,2,3];
var layout2=[0,1,2,3,4,3,4,0,1,2,1,2,3,4,0,4,0,1,2,3,2,3,4,0,1];
var layout3=[2,0,1,3,4,3,1,4,0,2,4,2,3,1,0,1,4,0,2,3,0,3,2,4,1];
var layout4=[1,3,2,0,4,0,4,1,2,3,4,2,0,3,1,3,0,4,1,2,2,1,3,4,0];
var count=0;
var countx=0
var ele;
var imgs=[
    {name:"1",img:"banana.jpg"},
    {name:"2",img:"kiwi.jpg"},
    {name:"3",img:"orange.jpg"},
    {name:"4",img:"pine.jpeg"},
    {name:"5",img:"pom.jpeg"}
];

// Arranging fruits in the table
for(let e of fills){
    var txt="background-image:url("+imgs[layout2[countx]].img+")";
    e.setAttribute("style",txt);
    count++;
    countx++;
    
}

//removing 5 from table
var rand1=Math.floor(Math.random()*(5-0)+0);
var rand2=Math.floor(Math.random()*(11-5)+5);
var rand3=Math.floor(Math.random()*(16-11)+11);
var rand4=Math.floor(Math.random()*(21-16)+16);
var rand5=Math.floor(Math.random()*(26-21)+21);

var a1="[data-id='"+rand1+"']";
var a2="[data-id='"+rand2+"']";
var a3="[data-id='"+rand3+"']";
var a4="[data-id='"+rand4+"']";
var a5="[data-id='"+rand5+"']";

var s=document.querySelector(a1);
s.className+=" same";
s.style.border="2px dashed red";
var t=document.querySelector(a2);
t.className+=" same";
t.style.border="2px dashed red";
var u=document.querySelector(a3);
u.className+=" same";
u.style.border="2px dashed red";
var v=document.querySelector(a4);
v.className+=" same";
v.style.border="2px dashed red";
var w=document.querySelector(a5);
w.className+=" same";
w.style.border="2px dashed red";

var b1="[data-idx='"+rand1+"']";
var b2="[data-idx='"+rand2+"']";
var b3="[data-idx='"+rand3+"']";
var b4="[data-idx='"+rand4+"']";
var b5="[data-idx='"+rand5+"']";
 console.log(b1,b2,b3,b4,b5);

var a=document.querySelector(b1);
a.className+=" ans";
a.setAttribute("draggable","true");
var b=document.querySelector(b2);
b.className+=" ans";
b.setAttribute("draggable","true");
var c=document.querySelector(b3);
c.className+=" ans";
c.setAttribute("draggable","true");
var d=document.querySelector(b4);
d.className+=" ans";
d.setAttribute("draggable","true");
var e=document.querySelector(b5);
e.className+=" ans";
e.setAttribute("draggable","true");

//Adding taken 5 to drag box

document.getElementById('1').append(b);
document.getElementById('2').append(c);
document.getElementById('3').append(a);
document.getElementById('4').append(e);
document.getElementById('5').append(d);

 //adding listeners

 const missings=document.querySelectorAll('.ans');
 for(let a of missings){
    a.addEventListener('dragstart',dragstart);
    a.addEventListener('dragend',dragend);
 }

const placers=document.querySelectorAll('.same');
for(let a of placers){
    a.addEventListener('dragenter',dragenter);
    a.addEventListener('dragover',dragover);
    a.addEventListener('dragleave',x);
    a.addEventListener('drop',drop);
}


 // drag function 
 function dragstart(){
     console.log('dragstart');
     ele=this;
     console.log(ele);
 }

 function dragend(){
     console.log('dragend');
 }

function dragenter(e){
    e.preventDefault();
    this.className+=" hovered";
}

function dragover(e){
  e.preventDefault();
}

function x(){
    this.className="x";
}

function drop(){
 this.append(ele);
}
 //


 function reset(){
     setTimeout(()=>{window.location=window.location},500);
 }

 function check(){

 }