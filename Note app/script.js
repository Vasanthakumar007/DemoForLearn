var get=document.getElementById('in');
var ps=document.getElementById('psave');
var edi=document.getElementById('editer');
var txtAreaForEdit=document.getElementById('text_area');
var elementInEditMode;
var x=1;
var pbox;
var text
document.getElementById('save_btn').addEventListener('click',close);
document.getElementById('cancel_btn').addEventListener('click',cancel);
document.getElementById('delete_btn').addEventListener('click',delet);
function add(){
   if(true){
    pbox=document.createElement('p');
    console.log(pbox);
    pbox.className ="creater-us";
    pbox.setAttribute("id",x);
    pbox.setAttribute("onclick","edit(event)");
    ps.append(pbox);
    console.log(ps);
    x++;
   }
}

function edit(event){
    console.log("in for edit");
    edi.style.display="flex";
    txtAreaForEdit.value=event.target.textContent;
    elementInEditMode=event.target.id;
}

function close(){
    console.log("in for close");
    var val=txtAreaForEdit.value;
    console.log(val);
    edi.style.display='none';
    document.getElementById(elementInEditMode).innerText=val;
}

function cancel(){
    edi.style.display='none';
}

function delet(){
    document.getElementById(elementInEditMode).remove();
    edi.style.display='none';
}

