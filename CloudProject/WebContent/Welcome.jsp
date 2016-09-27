<%@page import="com.cloud.view.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Result Window</title>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Result Window</h1> 
</div>
<%
    Customer customer=(Customer)request.getAttribute("cust");
%>
<div class="alert alert-success">
    <strong>Success!</strong> Please check the below Result Window for Details
  </div>
<table align="center" bgcolor="##99ABCD" border="1" width="50%">
    <tr >
         <td colspan="2" align="center"> <span class="label label-success"><%="Welcome "+customer.getName()+" !!!!. Your details Processed." %></span></td>
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

 <ul class="pager">
  <li><a href="index.jsp">Click here to redirect</a></li>
</ul>
</html>