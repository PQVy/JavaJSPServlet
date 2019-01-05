<%-- 
    Document   : listbooks
    Created on : Dec 25, 2018, 5:01:23 PM
    Author     : phamq
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="index.jsp"/>
    </head>
    <body>
        
        <table border="2" style="font-size: 30px; align-content: center; margin-left: auto; margin-right: auto" > 
            <tr>
                <th>Ordinal</th>
                <th>Book Code</th>  
                <th>Book Name</th>  
                <th>Book Author</th>  
                <th>Status</th>  
                <th>Details</th>  
                
            </tr>  
            <c:forEach items="${listBook}"  var="books">  
                <tr>  
                    <td> <c:out value="${books.bookid}" /> </td>
                    <td> <c:out value="${books.bookcode}" /> </td>
                    <td> <c:out value="${books.bookname}" /> </td>
                    <td> <c:out value="${books.bookauthor}" /> </td>       
                    <td> <c:out value="${books.bookdescrip}" /> </td>       
                    <td>
                        <form action="DetailBookServlet" method="POST">
                            <!--<input type="button" name />-->
                            <input type="submit" name="bookcode" value="${books.bookcode}"/>
                        </form>
                    </td>       
                </tr>
                   
            </c:forEach>
                <tr style="font-size: 20px">
                    <td colspan="6">
                        Change status Book
                        <form action="UpdateBookStatusServlet" method="POST">
                            Input status book (value Returned or Borrowed)
                            <input type="text" name="bookstatus"/></br>
                            Input value bookcode
                            <input type="text" name="bookcode"/></br>
                            <input type="submit" value="Update"/>
                        </form>
                    </td>
                </tr>
        </table>  
    </body>
</html>
