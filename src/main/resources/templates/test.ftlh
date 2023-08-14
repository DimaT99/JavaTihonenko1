<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
    <script>
        var userAnswers = [];
        var correctAnswers = [];

        function questionTest() {
            for (i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        var answer = prompt("How much will be 1 + 1?\n 1 - 2,\n 2 - 0,\n 3 - 3");
                        correctAnswers.push(1);
                        userAnswers.push(answer);
                        break;
                    case 1:
                        var answer = prompt("How much will be 2 + 2?\n 1 - 3,\n 2 - 4,\n 3 - 0");
                        correctAnswers.push(2);
                        userAnswers.push(answer);
                        break;
                    case 2:
                        var answer = prompt("How much will be 2 / 2?\n 1 - 0,\n 2 - 2,\n 3 - 1");
                        correctAnswers.push(3);
                        userAnswers.push(answer);
                        break;
                    case 3:
                        var answer = prompt("How much will be 1 * 1?\n 1 - 2,\n 2 - 1,\n 3 - 0");
                        correctAnswers.push(2);
                        userAnswers.push(answer);
                        break;
                    case 4:
                        var answer = prompt("How much will be 1 - 1?\n 1 - 0,\n 2 - 1,\n 3 - 2");
                        correctAnswers.push(1);
                        userAnswers.push(answer);
                        break;
                }
            }
            var result = 0;
            var percent = 0;
            for (j = 0; j < 5; j++) {
                result = result + "Correct answer - " + correctAnswers[j] + ", user answer - " + userAnswers[j] + ".<br>";
                if (parseInt(correctAnswers[j]) === parseInt(userAnswers[j])) {
                    percent++;
                }
            }
            document.getElementById("finalResult").innerHTML = "<h3>"+ result + "</h3><h3>Progress - " + (percent / 5 * 100) + "%" + ".</h3>";
        }
    </script>
</head>
<body>
<h2>
    Test</h2>
<h2>
    <button onclick="questionTest()">Start</button>
</h2>
<p id="finalResult"></p>
<a href="/">Main </a>
</body>
</html>