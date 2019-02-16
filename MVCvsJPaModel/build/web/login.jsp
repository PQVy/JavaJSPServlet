<%-- 
    Document   : login
    Created on : Jan 19, 2019, 1:26:49 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Login Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="POST">
            Username: <input type="text" name="username" /></br>
            Password: <input type="password" name="password" /></br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
