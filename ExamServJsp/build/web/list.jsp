<%-- 
    Document   : list
    Created on : Feb 14, 2019, 7:03:09 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EMPLOYEE LIST</title>
        <link href="css/style.css" type="text/css" rel="stylesheet" />
    </head>
    <body> 
        <table id="tb" width="100%" align="center">
                    <tr>
                        <th colspan="11" height="50px"><h4>EMPLOYEE LIST</h4></th>
                    </tr>
                    <tr>
                        <th>ID</th>
                        <th>Full name</th>
                        <th>Birthday</th>
                        <th>Address</th>
                        <th>Position</th>
                        <th>Department</th>
                    </tr>
                    <c:forEach var="emp" items="${getAllEmployee}">
                        <tr>
                            <td>${emp.id}</td>
                            <td>${emp.fullname}</td>
                            <td>${emp.birthday}</td>
                            <td>${emp.address}</td>
                            <td>${emp.position}</td>
                            <td>${emp.department}</td>
                        </tr>
                    </c:forEach>
                </table>
    </body>
</html>
