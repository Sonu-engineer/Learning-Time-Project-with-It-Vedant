// function print(){

//     let sname=Number(document.getElementById("studentName").value);
//     let sclass=Number(document.getElementById("studentClass").value);
//     let srollno=Number(document.getElementById("studentRollno").value);
//     let sbhindi=Number(document.getElementById("hindi").value);
//     let senglish=Number(document.getElementById("english").value);
//     let smath=Number(document.getElementById("math").value);
//     let scomputer=Number(document.getElementById("computer").value);
//     let sart=Number(document.getElementById("art").value);

//    let np=document.createElement("p");
//    np.innerHTML= sname;
//    np.style.color="maroon";
//    np.style.fontSize="20px";
   

//    let cp=document.createElement("p");
//    cp.innerHTML=sclass;
//    cp.style.color="forestgreen";
//    cp.style.fontSize="20px";

//    let rp=document.createElement("p");
//    rp.innerHTML=srollno;
//    rp.style.color="darkslategray";
//    rp.style.fontSize="20px";

//    let marks=document.createElement("P");
//    marks.innerHTML=sbhindi+senglish+smath+scomputer+sart; 
//    marks.style.color="deepskyblue";
//    marks.style.fontSize="20px";

//  document.body.appendChild(np);
//  document.body.appendChild(cp);
//   document.body.appendChild(rp);
//   document.body.appendChild(marks);
//     // if()
// }



function print() {


let sname = document.getElementById("studentName").value;
let sclass = document.getElementById("studentClass").value;
let srollno = document.getElementById("studentRollno").value;

let sbhindi = Number(document.getElementById("hindi").value);
let senglish = Number(document.getElementById("english").value);
let smath = Number(document.getElementById("math").value);
let scomputer = Number(document.getElementById("computer").value);
let sart = Number(document.getElementById("art").value);

let total = sbhindi + senglish + smath + scomputer + sart;
let percentage = total / 5;

let grade;

if (percentage >= 90) {
    grade = "A+";
} else if (percentage >= 80) {
    grade = "A";
} else if (percentage >= 70) {
    grade = "B";
} else if (percentage >= 60) {
    grade = "C";
} else if (percentage >= 50) {
    grade = "D";
} else {
    grade = "F";
}

let result;

if (percentage >= 33) {
    result = "PASS";
} else {
    result = "FAIL";
}

let newPage = window.open("", "_blank");

newPage.document.write(`
    <html>
    <head>
        <title>Student Result</title>

        <style>
            body {
                font-family: Arial;
                background-color: #f2f2f2;
                padding: 40px;
            }

            .result {
                width: 600px;
                margin: auto;
                padding: 30px;
                background-color: white;
                border-radius: 15px;
                box-shadow: 0 0 15px gray;
            }

            h1 {
                text-align: center;
                color: maroon;
            }

            p {
                font-size: 20px;
                padding: 5px;
            }

            .total {
                color: deepskyblue;
            }

            .percentage {
                color: forestgreen;
            }

            .grade {
                color: purple;
            }

            .pass {
                color: green;
                font-weight: bold;
            }

            .fail {
                color: red;
                font-weight: bold;
            }
        </style>
    </head>

    <body>

        <div class="result">

            <h1>Student Result</h1>

            <hr>

            <p>Student Name: ${sname}</p>
            <p>Class: ${sclass}</p>
            <p>Roll No: ${srollno}</p>

            <hr>

            <p>Hindi: ${sbhindi}</p>
            <p>English: ${senglish}</p>
            <p>Math: ${smath}</p>
            <p>Computer: ${scomputer}</p>
            <p>Art: ${sart}</p>

            <hr>

            <p class="total">Total Marks: ${total} / 500</p>
            <p class="percentage">Percentage: ${percentage.toFixed(2)}%</p>
            <p class="grade">Grade: ${grade}</p>
            <p class="${result === "PASS" ? "pass" : "fail"}">
                Result: ${result}
            </p>

        </div>

    </body>
    </html>
`);

newPage.document.close();












}
