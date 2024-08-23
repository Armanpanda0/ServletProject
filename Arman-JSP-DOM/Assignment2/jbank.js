let user_1={
 accName:'Arman Panda',
 transaction:[100,200,300,-150],
 pin:1234,
 intRate:1
};
let user_2={
 accName:'Raja Mishra',
 transaction:[100,200,300,-150],
 pin:1234,
 intRate:1
};
let user_3={
 accName:'Akhash kumar ratha',
 transaction:[100,200,300,-150],
 pin:1234,
 intRate:1
};
let user_4={
 accName:'Jatin Nima parida',
 transaction:[100,200,300,-150],
 pin:1234,
 intRate:1
};

let objArray=[user_1,user_2,user_3,user_4];

function accountUser(accs){
  accs.forEach(function(acc){
    acc.username=acc.accName.toLowerCase().split(" ").map((cName)=>{return cName[0]}).join("");
   // console.log(acc);



   
  });

}
accountUser(objArray);

let NameUser=document.getElementById('usename');
let PassUser=document.getElementById('passw');
let submitBtn=document.getElementById('submitA');
let disname=document.getElementById('name');
let loading=document.getElementById('load');
let currentAccount;
submitBtn.addEventListener('click',function(event){
  event.preventDefault();
  let usn=NameUser.value.toLowerCase().trim();
  let pin=Number(PassUser.value);

  currentAccount=objArray.find(function(user){
    return user.username===usn;
    });
    if(currentAccount?.pin===pin){
      disname.innerText=`Welcome ${currentAccount.accName.split(" ").join("")}`;
    }
    NameUser.value=PassUser.value="";
});







let totalAmountBtn=document.getElementById('totalAmount');
let amountDisplay=document.getElementById('displ');

totalAmountBtn.addEventListener('click',function(e){

  amountDisplay.innerHTML=``;
});



// submitBtn.addEventListener('click',()=>{
//         event.preventDefault();
//     let disName=NameUser.value;
//     disname.innerHTML=`<h4>Hi Mr. ${disName} welcome to <h5><span style="color: rgb(255, 200, 0);
//     font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
//      ">J</span>BANK</h4></h3>`;
// });


// NameUser.addEventListener('input',()=>{
//     event.preventDefault();
//     let disName=NameUser.value;
//     disname.innerHTML=`Hi Mr. ${disName}`;
// });

// For Authentication




/*
//code
let credentials = {
  username: 'admin',
  password: 'password'
};

let usernameInput = document.getElementById('username');
let passwordInput = document.getElementById('password');
let submitBtn = document.getElementById('submit-btn');
let resultDiv = document.getElementById('result');

submitBtn.addEventListener('click', () => {
  let username = usernameInput.value;
  let password = passwordInput.value;

  if (username === credentials.username && password === credentials.password) {
    resultDiv.innerText = 'Login successful!';
  } else {
    resultDiv.innerText = 'Invalid username or password!';
  }
});


//Explanation
In this example, we define an object credentials that contains the expected username and password values.

When the user clicks the submit button, we get the current values of the username and password input fields using usernameInput.value and passwordInput.value.

We then compare these values to the expected values stored in the credentials object using the === operator. 
If the values match, we set the innerText property of the resultDiv element to a success message. Otherwise, we set it to an error message.

*/

