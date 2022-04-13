var counter=0;
check();
function check(){
	var x=document.getElementById('txt_area').value;
	var noOfWords=x.split(" ").length;
	console.log(noOfWords);
	document.getElementById('y1').innerHTML=noOfWords;
	document.getElementById('y2').innerHTML=x.length;
	vowelCounter(x);


}
function vowelCounter(z){
	z.toLowerCase();
	for(var i=0;i<z.length;i++){
		if(z.charAt(i)==='a' ||z.charAt(i)==='e'||z.charAt(i)==='i' ||z.charAt(i)==='o' ||z.charAt(i)==='u'){
			counter+=1;
		}
	}
	document.getElementById('y3').innerHTML=counter;

}