<%-- 
    Document   : viewemp
    Created on : Dec 13, 2018, 10:29:05 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.username==null}">
    <jsp:forward page="login.jsp" ></jsp:forward>
</c:if>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Emp Salary</title>
    </head>
    <body>
        <h2>Welcome, ${sessionScope.username}</h2>
    </body>
</html>
