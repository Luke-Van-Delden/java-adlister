<%--
  Created by IntelliJ IDEA.
  User: lukevandelden
  Date: 2/2/23
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<form action="/login.jsp" method="post">
    <label for="uname">Username: </label><br>
    <input type="text" id="uname" name="uname"><br>
    <label for="pword">Password:</label><br>
    <input type="text" id="pword" name="pword">
    <input type="submit" value="Submit">
</form>

<%! String uname; %>
<%! String pword; %>
<%--<%! String success; %>--%>
<% uname = request.getParameter("uname"); %>
<% pword = request.getParameter("pword"); %>

<%--<%if (uname.equals("admin") && pword.equals("password")){--%>
<%--    success = "<h1>Success</h1>";--%>
<%--}%>--%>

<% if(request.getMethod().equalsIgnoreCase("post")){
 String uname;
 String pword;
 uname = request.getParameter("uname");
 pword = request.getParameter("pword");
 if(uname.equals("admin") && pword.equals("password")){
     response.sendRedirect("/profile.jsp");
 }
}%>


<%--<c:if test="${param.uname != null} && ${param.pword != null}">--%>
<%--<h1>Howdy, Luke!</h1>--%>
<%--</c:if>--%>



<%--<c:if test="${param.uname != 'admin'}">--%>
<%--<h1>Howdy, ${param.uname}!</h1>--%>

</body>
</html>