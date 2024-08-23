let rangeInput = document.getElementById('range');
let submitButton = document.querySelector("#submit");


submitButton.addEventListener('click',(e)=>{
    e.preventDefault();
    let range = parseInt(rangeInput.value);


    // Function to check if a number is odd
    function isOdd(num) {
        return num % 2 !== 0;
    }

    let oddNumbers = [];
      for (let i = 1; i <= range; i++) {
        if (isOdd(i)) {
            oddNumbers.push(i);
        }
      }
      function displayOdd(num){
        if(num.length != 0){
            let eachEmp=``;
            for(let nums of num){
                eachEmp+=` <ul class="list-group">
                <li class="list-group-item list-group-item-success mb-3"">${nums}
                </li>
                
              </ul>`
            }
            document.getElementById('display').innerHTML=eachEmp;
        }
       
        
    }
    displayOdd(oddNumbers);

})