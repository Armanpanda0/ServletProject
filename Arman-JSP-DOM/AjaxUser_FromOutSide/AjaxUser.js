function fetchData(){
    let xhr=new XMLHttpRequest();

    xhr.open('GET',"https://jsonplaceholder.typicode.com/todos",true);

    xhr.send();

    xhr.addEventListener('load',function(){

       // console.log(xhr.responseText);


        let arr=JSON.parse(xhr.responseText);
       // let{itemmA}=dataitem;
        console.log(arr);
        
               let eachItem=``;
               for(let dataIte of arr)
               {
                  eachItem+=`
                  <tr>
                  <td>${dataIte.userId}</td>
                  <td>${dataIte.id}</td>
                  <td>${dataIte.title}</td>
                  <td>${dataIte.completed}</td>
               
                  
              </tr>`  
               }
               //console.log(eachItem);
               document.querySelector('#display-emp').innerHTML=eachItem;
               console.log(eachItem);
            
    
    });
}

fetchData();