function changeForm(form) {
    let forms = document.querySelectorAll("form>div");
    if (form == 0) {
        forms[0].classList.remove("hidden");
        forms[0].classList.add("form-style");
        forms[1].classList.add("hidden");
        forms[1].classList.remove("form-style");
    } else {
        forms[1].classList.remove("hidden");
        forms[1].classList.add("form-style");
        forms[0].classList.add("hidden");
        forms[0].classList.remove("form-style");
    }
}

    /* LOGIN VALIDATION */
    let loginSub = document.getElementById("submitLogin");

    loginSub.addEventListener("click", loginValidation);
    

    
    let perdoruesi = document.getElementById("username");
    let fjalekalimi = document.getElementById("password");


function loginValidation() {
     if(perdoruesi.value == "") {
        alert("Username nuk mund te jete i zbrazet");
        return;
    }
    if(fjalekalimi.value == "") {
        alert("Fjalekalimi nuk mund te jete i zbrazet");
        return;
    }
        alert("Success!");
        
    
}

/* Register Validation */

let name = document.getElementById("name");
let perdoruesiRegister = document.getElementById("usernameRegister");
let fjalekalimiRegister = document.getElementById("passwordRegister");

let registerSub = document.getElementById("submitRegister");

registerSub.addEventListener("click",registerValidation);

function registerValidation() {
    let nameValidator = /[a-zA-Z]+\s[a-zA-Z]+/;
    
    if(name.value == "") {
        alert("Emri nuk mund te jete i zbrazet")
    }
    if(!nameValidator.test(name.value)) {
        alert("Wrong Full name");
        return;
    }


    let usernameValidator = /(^[0-9])/;
    if(usernameValidator.test(perdoruesiRegister.value)) {
        alert("Username nuk mund te filloj me numer");
        return;
    }
    
     
     let passwordValidator = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,}$/;
     if(fjalekalimiRegister.value == "") {
         alert("Fjalekalimi nuk mund te jete i zbrazet");
         return;
     }
     
     if(!passwordValidator.test(fjalekalimiRegister.value)) {
         alert("Fjalekalimi duhet te permbaje se paku nje numer dhe nje simbol si dhe minimumi 6 karaktere");
         return;
     }

     alert("Success!");


}






    


