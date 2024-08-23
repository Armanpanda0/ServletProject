let displays=document.getElementById('display');
let number=document.getElementById('value');
let submit=document.getElementById('submit');
let type=document.getElementById('type');
let array=[];
submit.addEventListener('click',function(e){
   e.preventDefault();
    let obj={
        label:number.value,
        type:type.value
    }
array.push(obj);
console.log(array);
   
 display();
})
function display()
{
    let str=``;
    array.forEach(function(value)
{
    console.log(value.type);
    str+=`
    <div class="card mt-3">
    <div class="card-body">
    <ul class="list-group">
    <li class="list-group-item list-group-item-warning mb-3"">
    <input type="${value.type}"  class="form-control" placeholder="${value.label}">
    </li>
    
    </ul>
    </div>
    </div>
    `;
})
console.log(str);
    displays.innerHTML=str;
}