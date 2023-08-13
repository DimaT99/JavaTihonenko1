<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
    <script>

        function showMessage() {
            var name = prompt("?\n 1 - ,\n 2 - ,\n 3 -, \n 4 -,\n 5 - ");
            Number(name);
            var result = 0;
            if (name == 1) {
                result++;
            }
            document.getElementById("result").value = result.toFixed(0);
            return result;
        }
    </script>
</head>
<body>
<h2>Test</h2>
<button onclick="showMessage()">Start</button><br>
<label>result: <input type="number" id="result" disabled> from 5</label>

</body>
</html>