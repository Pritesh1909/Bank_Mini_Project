document.getElementById("login_button").addEventListener("click", sendData);

function sendData() {

    const name = document.getElementById("username").value;
    const pass = document.getElementById("password").value;
    let url = "http://localhost:8080/login";
    const xhr = new XMLHttpRequest();

    xhr.open("POST", url, true);
    xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
    xhr.onload = () => {
        if (xhr.status === 200) {
            console.log(xhr.response);
            if(xhr.responseText === "true"){
                url = "http://localhost:8080/account";
                const get = new XMLHttpRequest();
                get.open("GET",url,true);
                get.send();
            }
            else {
                alert("you entered wrong combination.")
            }
        }
        else {
            console.log("error");
        }
    }
    data = `{"userName":"${name}","password":"${pass}"}`;
    xhr.send(data);
};