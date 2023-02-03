<%--
  Created by IntelliJ IDEA.
  User: lukevandelden
  Date: 2/3/23
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="pizza-order" method="post">
<label for="crust">Crust Type:</label>
<select name="crust" id="crust">
  <option value="original">Original</option>
  <option value="stuffed">Stuffed</option>
  <option value="thin">Thin</option>
</select>

<label for="sauce">Sauce:</label>
<select name="sauce" id="sauce">
  <option value="normal">Normal</option>
  <option value="light">Light</option>
  <option value="bbq">BBQ</option>
</select>

<label for="size">Size:</label>
<select name="size" id="size">
  <option value="personal">Personal</option>
  <option value="small">Small</option>
  <option value="medium">Medium</option>
  <option value="large">Large</option>
</select>

<input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
<label for="pepperoni"> Pepperoni</label><br>
<input type="checkbox" id="sausage" name="sausage" value="sausage">
<label for="sausage"> Sausage</label><br>
<input type="checkbox" id="mushrooms" name="mushrooms" value="mushrooms">
<label for="mushrooms"> Mushrooms</label><br>

  <label for="delivery">Deliver to:</label>
  <input type="text" id="delivery" name="delivery"><br>
  <input type="submit" value="Submit">

</form>
</body>
</html>
