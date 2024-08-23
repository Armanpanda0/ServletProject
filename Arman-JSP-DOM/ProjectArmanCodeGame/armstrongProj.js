let rangeInput = document.getElementById('range');
let submitButton = document.querySelector("#submit");

submitButton.addEventListener('click', (e) => {
  e.preventDefault();
  let range = parseInt(rangeInput.value);

  // Function to check if a number is an Armstrong number
  function isArmstrong(num) {
    let sum = 0;
    let temp = num;
    let digits = num.toString().length;
    while (temp > 0) {
      let digit = temp % 10;
      sum += Math.pow(digit, digits);
      temp = Math.floor(temp / 10);
    }
    return sum === num;
  }

  let armstrongNumbers = [];
  for (let i = 1; i <= range; i++) {
    if (isArmstrong(i)) {
      armstrongNumbers.push(i);
    }
  }

  function displayArmstrong(num) {
    if (num.length != 0) {
      let eachEmp = ``;
      for (let nums of num) {
        eachEmp += `<ul class="list-group">
                <li class="list-group-item list-group-item-success mb-3">${nums}
                </li>
                
              </ul>`
      }
      document.getElementById('display').innerHTML = eachEmp;
    }
  }
  displayArmstrong(armstrongNumbers);
})