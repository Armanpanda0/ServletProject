let rangeInput = document.getElementById('range');
let submitButton = document.querySelector("#submit");


submitButton.addEventListener('click',(e)=>{
    e.preventDefault();
    let range = parseInt(rangeInput.value);


    //create a fum for check
    function isPrime(num) {
        if (num <= 1) return false;
        for (let i = 2; i * i <= num; i++) {
          if (num % i === 0) return false;
        }
        return true;
      }

      let primeNumbers = [];
      for (let i = 2; i <= range; i++) {
        if (isPrime(i)) {
            primeNumbers.push(i);
        }
      }
      function displayprime(num){
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
    displayprime(primeNumbers);
2
})