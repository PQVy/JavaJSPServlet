<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${sessionScope.username==null}">
    <jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<c:if test="${sessionScope.username==null}">
    <jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/menu_style.css" type="text/css" rel="stylesheet" />
        <link href="css/style.css" type="text/css" rel="stylesheet" />
        <title>Search Employee</title>
    </head>
    <body>
        <div class="header">
            <br>
            <h1 align="center">Employees Manager</h1>
            <div class="menu bubplastic horizontal orange">
                <ul>
                    <li><span class="menu_r"><a href="login.jsp"><span class="menu_ar">Login</span></a></span></li>
                    <li><span class="menu_r"><a href="EmployeeManager"><span class="menu_ar">Employee Manager</span></a></span></li>
                    <li><span class="menu_r"><a href="processEmployee.jsp"><span class="menu_ar">Add New Employee</span></a></span></li>
                    <li class="highlight"><span class="menu_r"><a href="searchEmployee.jsp"><span class="menu_ar">search employee</span></a></span></li>
                    <li><span class="menu_r"><a href="logout.jsp"><span class="menu_ar">logout</span></a></span></li>
                </ul>
                <br class="clearit" />
            </div>
        </div>
        <div class="content">
            <br><br>
            <form action="SearchEmp" method="post">
                <table align="center" id="tb2">
                    <tr>
                        <th align="center" colspan="3"><h3>Search Employee</h3></th>
                    </tr>
                    <tr>
                        <td>Search Value</td>
                        <td><input type="text" name="txtValue"></td>
                    </tr>
                    <tr>
                        <td>Search By</td>
                        <td>
                            <select name="ddlSearch">
                                <option>Name</option>
                                <option>City</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center"><input type="submit" name="btnSearch" value="Search"></td>
                    </tr>
                </table>
            </form>

            <br>
                <table id="tb" width="100%" >
                    
                    <tr>
                        <th>Name</th>
                        <th>Birthday Date</th>
                        <th>Hire Date</th>
                        <th>Address</th>
                        <th>City</th>
                        <th>Country</th>
                        <th>Mobile</th>
                        <th>Email</th>
                        <th colspan="2"></th>
                    </tr>
                    <jsp:useBean id="convert" scope="page" class="HRManager.ConvertData"/>
                    <c:forEach var="emp" items="${SearchEmployee}">
                        <tr>
                            <td>${emp.firstName}  ${emp.lastName}</td>
                            <td>${convert.date2string(emp.birthDate)}</td>
                            <td>${convert.date2string(emp.hireDate)}</td>
                            <td>${emp.address}</td>
                            <td>${emp.city}</td>
                            <td>${emp.country}</td>
                            <td>${emp.mobile}</td>
                            <td>${emp.email}</td>
                            <td align='center'><a href='ProcessEmployee?action=edit&id=${emp.employeeID}'>Edit </a></td>
                            <td align='center'><a href='ProcessEmployee?action=delete&id=${emp.employeeID}'>Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
          
        </div>
    </body>
</html>
