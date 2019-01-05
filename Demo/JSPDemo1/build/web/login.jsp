<%-- 
    Document   : login
    Created on : Dec 8, 2018, 8:26:18 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--Demo cach viet JSP lam controller, model, view-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="checkLogin.jsp" method="post" >
            UserName: <input type="text" name="username" /></br>
            UserName: <input type="password" name="password" /> </br>
            <input type="submit" value="login"/>
        </form>
    </body>
</html>
