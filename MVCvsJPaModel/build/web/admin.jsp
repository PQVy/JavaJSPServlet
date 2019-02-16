<%-- 
    Document   : admin
    Created on : Jan 19, 2019, 1:26:57 PM
    Author     : phamq
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${requestScope.NoInput}</h1>
        <h2>Welcome, ${sessionScope.loginuser}</h2>
        <form action="ManageServlet" method="POST">
            <table>
                <th colspan="2" ><h3>Employee Information</h3></th>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="empid" value="${employee.empid}" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname" value="${employee.firstname}" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastname" value="${employee.lastname}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${employee.email}" /></td>
                </tr>
                <tr>
                    <td>Salary</td>
                    <td><input type="text" name="salary" value="${employee.salary}"/></td>
                </tr>

            </table>
            </br>
            <input type="submit" name="action" value="ADD" /> | 
            <input type="submit" name="action" value="EDIT" /> |
            <input type="submit" name="action" value="DELETE" /> |
            <input type="submit" name="action" value="VIEW" /> |

        </form>
        </br>
        <table>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Salary</th>

            <c:forEach var="emp" items="${getAllEmployee}">
                <tr>
                    <td>${emp.empid}</td>
                    <td>${emp.firstname}</td>
                    <td>${emp.lastname}</td>
                    <td>${emp.email}</td>
                    <td>${emp.salary}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
