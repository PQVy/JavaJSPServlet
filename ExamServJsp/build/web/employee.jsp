<%-- 
    Document   : employee
    Created on : Feb 14, 2019, 6:35:07 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" type="text/css" rel="stylesheet" />
        <title>JSP Page</title>
    </head>
    <body>
        <form action="EmpManagerServlet" method="POST">
            <table id="tb" width="100%" align="center">
                <th colspan="2" ><h3>Create Employee</h3></th>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>Full Name</td>
                    <td><input type="text" name="fullname"/></td>
                </tr>
                <tr>
                    <td>Birthday</td>
                    <td><input type="text" name="birthday"/></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address"/></td>
                </tr>
                <tr>
                    <td>Position</td>
                    <td><input type="text" name="position"/></td>
                </tr>
                <tr>
                    <td>Department</td>
                    <td><input type="text" name="department"/></td>
                </tr>
            </table>
            </br>
            <input type="submit" name="action" value="Submit" />
            <input type="submit" name="action" value="Reset" />
            <h2 style="color: red">${requestScope.error}</h2>
        </form>
    </body>
</html>
