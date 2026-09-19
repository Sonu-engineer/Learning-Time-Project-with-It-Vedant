let stor = [];


// Add multiple names
function multiple() {

    try {

        let input = document.querySelector("#takeinput");

        let name = input.value.trim();

        // Check empty input
        if (name === "") {
            alert("Please enter a name");
            return;
        }

        // Check duplicate name
        if (stor.includes(name)) {
            alert(name + " is already stored");
            return;
        }

        // Add name to array
        stor.push(name);

        // Show names
        showNames();

        // Clear input
        input.value = "";

    } catch (e) {

        showError(e);
    }
}



function enter() {

    try {

        let us = document.querySelector("#username").value.trim();

        let heading = document.querySelector("#heading");
        let heading1 = document.querySelector("#heading1");

        // Clear previous result
        heading.innerHTML = "";
        heading1.innerHTML = "";

        if (us === "") {
            heading1.innerHTML = "Please enter a name";
            return;
        }


        // Check name in array
        if (stor.includes(us)) {

            heading.innerHTML =
                us + " - this name is matched";

            heading.style.color = "green";

        } else {

            heading1.innerHTML =
                us + " - this name is not matched";

            heading1.style.color = "red";
        }

    } catch (e) {

        showError(e);
    }
}


function showNames() {

    let list = document.querySelector("#list");

    if (stor.length === 0) {

        list.innerHTML = "No names stored yet.";

    } else {

        list.innerHTML = stor.join(", ");
    }
}



function clearNames() {

    stor = [];

    showNames();

    document.querySelector("#heading").innerHTML = "";
    document.querySelector("#heading1").innerHTML = "";
}



function showError(e) {

    let err = document.createElement("h4");

    err.innerHTML = "Error: " + e.message;
    err.style.color = "red";

    document.body.appendChild(err);
}