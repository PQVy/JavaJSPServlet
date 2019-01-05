<%-- 
    Document   : success
    Created on : Nov 28, 2018, 1:04:54 PM
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
        <h1>Welcome...</h1>
        <jsp:useBean id="bean" class="model.LoginBean" scope="request"/>
        <h2><jsp:getProperty name="bean" property="username"/></h2>
        
    </body>
</html>
