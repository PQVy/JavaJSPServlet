<%-- 
    Document   : index
    Created on : Dec 22, 2018, 9:27:29 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoginServlet" method="POST" >
            Username: <input type="text" name="username" />
            Password: <input type="password" name="password" />
            <input type="submit" value="Login" />
            <input type="reset" value="Reset" />
    </form>
    </body>
</html>
