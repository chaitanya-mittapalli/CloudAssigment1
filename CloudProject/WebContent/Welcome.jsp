<%@page import="com.cloud.view.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Window</title>
</head>
<body>
<%
    Customer customer=(Customer)request.getAttribute("cust");
%>
<table align="center" bgcolor="##99ABCD" border="1" width="50%">
    <tr>
        <td colspan="2" align="center"><%="Welcome "+customer.getName()+" !!!!. Your details Processed." %></td>
    </tr>
    <tr>
        <td>Name </td>
        <td><%=customer.getName()%></td>
    </tr>
    <tr>
        <td>Result </td>
        <td><%if(customer.getPrime()){%>
        <div>Number Is a Prime</div>
        <%} else { %>
        <div>Number Is Not a Prime</div>
        <% } %>
         </td>
    </tr>
   
</table>
<div style="text-align:center">
  <a href="index.jsp">Click here to redirect</a>​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
</div></body>
</html>