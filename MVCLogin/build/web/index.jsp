<%-- 
    Document   : index.jsp
    Created on : Nov 28, 2018, 1:03:12 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <form name="frmLogin" action="./ControllerServlet" method="POST">
            User Name: <input type="text" name="username"/></br>
            Password: <input type="password" name="password"/></br>
            <input type="submit" value="Login"/></br>
        </form>
    </body>
</html>
