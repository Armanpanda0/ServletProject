let rangeInput = document.getElementById('range');
let submitButton = document.querySelector("#submit");

submitButton.addEventListener('click',(e)=>{
    e.preventDefault();
    let rangeValue= parseInt(rangeInput.value)

    //check odd number
    function even(num){
        if( num % 2 == 0 ){
            return true
        }
    }
     let evenarr=[];
     for(let i=1;i<= rangeValue ;i++){
        if(even(i)){
            evenarr.push(i);
        }
     }

     function displayeven(num){
        if(num.length !=0){
            let eachNum=``;
            for(let nums of num){
                eachNum+=`<ul class="list-group">
                <li class="list-group-item list-group-item-success mb-3"">${nums}
                </li>
                
              </ul>`
            }
            document.getElementById('display').innerHTML=eachNum;
        }
        
     }
     displayeven(evenarr);
})


