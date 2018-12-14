<%-- 
    Document   : result
    Created on : Dec 12, 2018, 8:30:53 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List product</title>
    </head>
    <body>
        <h1>List Product</h1>
        <a href="search.jsp">Search</a>
        <jsp:useBean class="com.example.model.ProductFinderBean" id="finder" scope="request"/>
        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Description</td>
            </tr>
            
            //step 4: 
            <c:forEach items="${finder.products}" var="product" >
                <tr>
                    <td><c:out value="${product.id}"/> </td>
                    <td><c:out value="${product.name}"/> </td>
                    <td><c:out value="${product.desc}"/> </td>
                </tr>
            </c:forEach>

        </table
        
    </body>
</html>
