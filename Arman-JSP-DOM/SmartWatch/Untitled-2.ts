// Get the input field and the submit button
const rangeInput = document.getElementById('range');
const submitButton = document.querySelector('input[type="submit"]');

// Add an event listener to the submit button
submitButton.addEventListener('click', (e) => {
  e.preventDefault(); // Prevent the form from submitting

  // Get the range value from the input field
  const range = parseInt(rangeInput.value);

  // Check if the range value is valid
  if (isNaN(range) || range < 2) {
    alert('Please enter a valid range value');
    return;
  }

  // Function to check if a number is prime
  function isPrime(num) {
    if (num <= 1) return false;
    for (let i = 2; i * i <= num; i++) {
      if (num % i === 0) return false;
    }
    return true;
  }

  // Generate the prime numbers in the range
  const primeNumbers = [];
  for (let i = 2; i <= range; i++) {
    if (isPrime(i)) primeNumbers.push(i);
  }

  // Display the prime numbers in a list
  const listElement = document.createElement('ul');
  primeNumbers.forEach((num) => {
    const listItem = document.createElement('li');
    listItem.textContent = num;
    listElement.appendChild(listItem);
  });

  // Add the list to the card body
  const cardBody = document.querySelector('.card-body');
  cardBody.appendChild(listElement);
});