<%-- 
    Document   : index
    Created on : Dec 25, 2018, 4:55:21 PM
    Author     : phamq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${not empty submitDone}">
            <script>alert("Successfully!!!");
            </script></c:if>
            
            <c:if test="${not empty submitFail}">
            <script>alert("Fail!!!");
            </script></c:if>
            
        <table border="1" style="font-size: 20px; align-items: center; align-content: center; margin-left: auto; margin-right: auto" >
            <tr>
                <td colspan="2">
                    <form action="BookServlet">
                        <input type="submit" value="List Book" style="color: red; height: 50px; width: 300px; margin-left: 80px; font-size: 30px"/>
                    </form>
                </td>

            </tr>
            <tr>
                <th>
                    <h4>Search by Book Code</h4>
                </th>
                <th>
                    <h4>Search by Book Name</h4>
                </th>
            </tr>
            <tr>
                <th>
                    <form action="SearchByBookCodeServlet" method="POST">
                        <input type="text" name="bookcode" />
                        <input type="submit" value="Search"/>
                    </form>
                </th>
                <th>

                    <form action="SearchByBookNameServlet" method="POST">
                        <input type="text" name="bookname" />
                        <input type="submit" value="Search"/>
                    </form>
                </th>
            </tr>
        </table>
        </br></br>


        
        
        
    </body>
</html>
