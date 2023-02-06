<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Products</title>
</head>
<body>
<h1>Here are all the products:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>Title: ${ad.title}</h2>
        <h6>UserID: ${ad.userId}</h6>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
