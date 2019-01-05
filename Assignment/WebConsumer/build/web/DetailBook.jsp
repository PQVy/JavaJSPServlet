<%-- 
    Document   : DetailBook
    Created on : Dec 26, 2018, 9:15:42 AM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="index.jsp"/>
    </head>
    <body>
       
        <table border="1" style="font-size: 30px; align-content: center; align-content: center; margin-left: auto; margin-right: auto" > 
            <tr>
                <td colspan="5">
                    <h3>Book Detail</h3>
                </td>
            </tr>
            <tr>
                <th>Ordinal</th>
                <th>Book Code</th>  
                <th>Book Name</th>  
                <th>Book Author</th>
                <th>Borrowed</th>    
                
            </tr>  
            <c:forEach items="${listBook}"  var="books">  
                <tr>  
                    
                    <td> <c:out value="${books.bookid}" /> </td>
                    <td> <c:out value="${books.bookcode}" /> </td>
                    <td> <c:out value="${books.bookname}" /> </td>
                    <td> <c:out value="${books.bookauthor}" /> </td> 
                    <td> <c:out value="${books.bookdescrip}" /> </td> 
                    
                       
                </tr>
               
                <tr>
                    <td colspan="5">
                        <b>History return and borrow</b>
                        .
                        .
                        .
                    </td>
                </tr>
                 <tr style="font-size: 20px">
                    <td colspan="6">
                        Change status Book
                        <form action="UpdateBookStatusServlet" method="POST">
                            Input status book (value Returned or Borrowed)
                            <input type="text" value="${books.bookdescrip}" name="bookstatus"/></br>
                            Input value bookcode
                            <input type="text" value="${books.bookcode}" name="bookcode"/></br>
                            <input type="submit" value="Update"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>  
        </table> 
    </body>
</html>
