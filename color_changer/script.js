var hex=[0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'];
var ans="";
function sim(){
	random();
	document.getElementById('simple').style.backgroundColor=ans;
	
}

function random(){
	var rand1=Math.floor(Math.random()*(16)-0);
	var rand2=Math.floor(Math.random()*(16)-0);
	var rand3=Math.floor(Math.random()*(16)-0);
	var rand4=Math.floor(Math.random()*(16)-0);
	var rand5=Math.floor(Math.random()*(16)-0);
	var rand6=Math.floor(Math.random()*(16)-0);
	ans="#"+hex[rand1]+hex[rand2]+hex[rand3]+hex[rand4]+hex[rand5]+hex[rand6];
}



function pic1(){
    random();
    document.getElementById('pic1').style.backgroundColor=ans;
}
function pic2(){
    random();
    document.getElementById('pic2').style.backgroundColor=ans;
}