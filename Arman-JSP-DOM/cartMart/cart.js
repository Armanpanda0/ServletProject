let itemm=[
    {
        id:101,
        name:"Dosa",
        img:"https://www.foodiesfeed.com/wp-content/uploads/2023/06/burger-with-melted-cheese.jpg", 
        price:60,
        qty:2
    },
    {
        id:102,
        name:"Dosa",
        img:"https://www.foodiesfeed.com/wp-content/uploads/2023/04/savory-pie-with-a-crisp-crust.jpg", 
        price:60,
        qty:2
    },
    {
        id:103,
        name:"Dosa",
        img:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrP5Jj6Ae1gLtDyJt8I1bA1Qx0q0p7w6A2aw&s", 
        price:60,
        qty:2
    },
    {
        id:104,
        name:"Dosa",
        img:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK1V9y4aAUZlpdamdasLFMxYjMbi8rEzcAZg&s", 
        price:60,
        qty:2
    },
   
   
];

function displayItems(foo)
{
    if(foo.length!=0)
    {
       let eachItem=``;
       for(let itemm of foo)
       {
          eachItem+=`<div class="col-3">
                <div class="card">
                    <div class="card-header">
                        <img src="${itemm.img}" alt="" class="img-fluid">
                    </div>
                    <div class="card-body text-center">
                        <h3>${itemm.name}</h3>
                        <small></small>
                        <h6>${itemm.price}&#8377;</h6>
                       <div>
                            <i class="fa fa-minus-circle" onclick="deqQun(${itemm.id})"></i>
                            <span>${itemm.qty}</span>
                            <i class="fa fa-plus-circle" onclick="inqQun(${itemm.id})"></i>
                        </div>
                    </div>
                </div>
            </div>`  
       }
       //console.log(eachItem);
       document.querySelector('#displayA').innerHTML=eachItem;

    }
}
displayItems(itemm);


//increment

function inqQun(id){
    let updateValue=itemm.map(function(value){
        if(value.id==this.id){
            let obj={...value,qty:++value.qty}
            return obj;
        }
        else{
            return value;
        }
    })
    displayItems(updateValue);
   

}


//Decreasing
function deqQun(id){
    let updateValue=itemm.map(function(value){
        if(value.id==id){
            let obj={...value,qty:--value.qty}
            return obj;
        }
        else{
            return value;
        }
    })
    displayItems(updateValue)

}


