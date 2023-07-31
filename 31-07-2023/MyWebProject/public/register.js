function userVerifier() {
    let name = document.getElementById("rname").value;
    let password = document.getElementById("rpass").value;
    let email = document.getElementById("rmail").value;
    let birthDate = document.getElementById("rdate").value;

    let birthYear = new Date(birthDate).getFullYear();
    let currentYear = new Date().getFullYear();
    let age = currentYear - birthYear;


    if (age <= 18) {
        alert("You must be over 18 years old to register.");
        return false;
    }

    if (name.length <= 8 || !/^[a-zA-Z ]+$/.test(name)) {
        alert("Please enter a valid name (only alphabets and spaces allowed, and length > 8).");
        return false;
    }

    if (password.length <= 8 || !/^[a-zA-Z0-9]+$/.test(password)) {
        alert("Please enter a valid password (only alphabets and numbers allowed, and length > 8).");
        return false;
    }

    if (!isValidEmail(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    return true;
}

function isValidEmail(email) {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailPattern.test(email);
}

function clearAll()
{
    document.getElementById("rname").innerHTML="";
    document.getElementById("rpass").innerHTML="";
    document.getElementById("rmail").innerHTML="";
    document.getElementById("rdate").innerHTML="";
}