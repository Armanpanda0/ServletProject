const form = document.querySelector('form');
const displayDiv = document.getElementById('display');
const submitButton = document.getElementById('submit');

submitButton.addEventListener('click', (e) => {
  e.preventDefault(); // prevent the form from submitting

  const valueType = document.getElementById('value').value;
  const typeValue = document.getElementById('type').value;

  let inputType;
  switch (typeValue) {
    case 'text':
      inputType = 'text';
      break;
    case 'number':
      inputType = 'number';
      break;
    case 'password':
      inputType = 'password';
      break;
    case 'color':
      inputType = 'color';
      break;
    case 'email':
      inputType = 'email';
      break;
    case 'tel':
      inputType = 'tel';
      break;
    case 'date':
      inputType = 'date';
      break;
    case 'time':
      inputType = 'time';
      break;
    case 'datetime-local':
      inputType = 'datetime-local';
      break;
    default:
      inputType = 'text';
  }

  const newField = document.createElement('div');
  newField.className = 'form-group d-grids mt-3';
  newField.innerHTML = `
  <div class="card mt-3">
  <div class="card-body">
  <ul class="list-group">
  <li class="list-group-item list-group-item-warning mb-3"">
  <input type="${inputType}" class="form-control" placeholder="Enter ${typeValue}" id="${typeValue}-${valueType}">
  </li>
  
  </ul>
  </div>
  </div>
    
  `;

  displayDiv.appendChild(newField);

  // clear the input fields
  document.getElementById('value').value = '';
  document.getElementById('type').value = '';
});