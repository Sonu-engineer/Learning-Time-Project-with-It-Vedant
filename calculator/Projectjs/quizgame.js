
let questions = [

    {
        question: "What is the capital of India?",
        answer: "Delhi"
    },

    {
        question: "How many days are there in a week?",
        answer: "7"
    },

    {
        question: "Which language is used to style HTML?",
        answer: "CSS"
    },

    {
        question: "Which language is used to make web pages interactive?",
        answer: "JavaScript"
    },

    {
        question: "What is 10 + 20?",
        answer: "30"
    }

];


// Variables

let username = "";

let currentQuestion = 0;

let score = 0;


// Start Game Function

function startGame() {

    username = document.getElementById("username").value;


    // Check username

    if (username.trim() === "") {

        alert("Please enter your name to start the game.");

        return;

    }


    // Hide start screen

    document.getElementById("start-screen").style.display = "none";


    // Show quiz screen

    document.getElementById("quiz-screen").style.display = "block";


    // Show first question

    showQuestion();


    // Show score

    showScore();

}


// Show Question Function

function showQuestion() {

    const questionElement =
        document.getElementById("question");

    const answerInput =
        document.getElementById("answer");


    questionElement.textContent =
        questions[currentQuestion].question;


    answerInput.value = "";

}


// Submit Answer Function

function submitAnswer() {

    const answerInput =
        document.getElementById("answer");


    // Get user answer

    const userAnswer =
        answerInput.value.trim().toLowerCase();


    // Get correct answer

    const correctAnswer =
        questions[currentQuestion].answer.toLowerCase();


    // Check answer

    if (userAnswer === correctAnswer) {

        score++;

        alert("Correct Answer!");

    } 
    else {

        alert(
            "Wrong Answer! Correct answer is: "
            + questions[currentQuestion].answer
        );

    }


    // Move to next question

    currentQuestion++;


    // Check if quiz is finished

    if (currentQuestion < questions.length) {

        showQuestion();

        showScore();

    } 
    else {

        endGame();

    }

}


// Show Score Function

function showScore() {

    document.getElementById("score").textContent =
        "Score: " + score;

}


// End Game Function

function endGame() {

    document.getElementById("question").textContent =
        "Quiz Completed!";


    document.getElementById("answer").style.display =
        "none";


    document.querySelector("#quiz-screen button").style.display =
        "none";


    document.getElementById("score").textContent =
        "Congratulations " + username +
        "! Your final score is " +
        score + "/" + questions.length;

}

