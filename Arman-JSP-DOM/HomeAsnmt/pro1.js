let displayArea=document.getElementById('textSpan');
let textArea=document.getElementById('textArea');

textArea.addEventListener('input',()=>{
    let text=textArea.value;
    displayArea.innerText=text;
});

let BTN1=document.getElementById('btn1');
let BTN2=document.getElementById('btn2');
let BTN3=document.getElementById('btn3');
let BTN4=document.getElementById('btn4');

BTN1.addEventListener('click',()=>{
    let text=textArea.value;
    text=text.toUpperCase();
    displayArea.innerHTML=text;

})
BTN2.addEventListener('click',()=>{
    let text=textArea.value;
    text=text.toLowerCase();
    displayArea.innerHTML=text;
    });
    BTN3.addEventListener('click',()=>{
        let text=textArea.value;
        text=text.split('');
        displayArea.innerHTML=text;
        });
