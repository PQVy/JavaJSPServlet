<%-- 
    Document   : viewdata
    Created on : Dec 8, 2018, 8:00:56 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP view data</title>
    </head>
    <body>
        
        <sql:setDataSource var="provider"
                           driver="org.apache.derby.jdbc.ClientDriver"
                           url="jdbc:derby://localhost:1527/MyDatabaseDemo"
                           user="sa"
                           password="sa" />
        
        <sql:query dataSource="${provider}" var="result">
            SELECT * FROM users
        </sql:query>
       
            <!--dung for each de duyet va in ban ghi tu database-->
            <c:forEach var="row" items="${result.rows}">
                <c:out value="${row.id}"/>
                <c:out value="${row.FirstName}"/>
                <c:out value="${row.LastName}"/>
            </c:forEach>
    </body>
</html>
