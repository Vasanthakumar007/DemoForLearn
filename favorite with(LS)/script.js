//getting old data s from local storage


//global variables
var favarr=[];
if(window.localStorage.getItem("fav")==null){
    window.localStorage.setItem("fav",favarr);
}else{
    var old=window.localStorage.getItem("fav");
    console.log("old: "+old);
    if(old.length>0){
        favarr=old.split(",");
        
        for(e of favarr){
          document.getElementById(e).className+=" fav";
        }
    }else{
        favarr=[];
    }
    console.log("favarr: "+favarr)
}


//elements catched
var fulllist=document.querySelector('.list').addEventListener('click',(e)=>{
    var old=window.localStorage.getItem("fav");
    if(old.length>0){
    favarr=old.split(",");
    }
    var x=e.target.id;
    if(favarr.includes(x)){
        document.getElementById(x).className="";
        favarr.splice(favarr.indexOf(x),1);
        window.localStorage.setItem("fav",favarr);

    }else{
    favarr.push(x);
    document.getElementById(x).className+=" fav";
    window.localStorage.setItem("fav",favarr);
    }
});
console.log("new: "+favarr);
//function

