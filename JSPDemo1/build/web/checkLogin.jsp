<%-- 
    Document   : checkLogin
    Created on : Dec 8, 2018, 8:30:31 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Model and Controller</title>
    </head>
    <body>
        <%
            try {
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    Connection conn;
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDatabaseDemo; user=sa; password=sa");
                    PreparedStatement pstm = conn.prepareStatement("SELECT username FROM users WHERE username = ? and password = ?");
                    pstm.setString(1, username);
                    pstm.setString(2, password);
                    ResultSet result = pstm.executeQuery();
                    if (result.next()) {
                        out.print("Login thanh cong");
                    } else {
                        out.print("Fail");
                    }
                } catch (SQLException ex) {
                    out.print("Loi ket noi database");
                }
        %>
    </body>
</html>
