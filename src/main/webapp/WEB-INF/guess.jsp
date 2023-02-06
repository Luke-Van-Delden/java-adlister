<%--
  Created by IntelliJ IDEA.
  User: lukevandelden
  Date: 2/3/23
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="guess" method="post">
    <label for="guess">Guess a number 1-3: </label><br>
    <input type="text" id="guess" name="guess"><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
