<%-- 
    Document   : login
    Created on : Dec 13, 2018, 10:28:55 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login</title>
    </head>
    <body>
        <h1>Login JSP</h1>
        <form action="LoginServlet" method="POST" >
            Username: <input type="text" name="username"/></br>
            Password: <input type="password" name="password"/></br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
