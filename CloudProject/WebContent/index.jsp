<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Prime validator</title>
</head>
<body>
<h1>Hello There if you can see this We are online</h1>
<form action="MyServlet" method="post">
<table align="center" bgcolor="#99ABCD" border="1" width="50%">
    <tr>
        <td colspan="2" align="center">Enter a Number to Validate Prime or not </td>
    </tr>
    <tr>
        <td>Your Name </td>
        <td><input type="text" name="name" maxlength="25"></td>
    </tr>
    <tr>
        <td>Number to Validate</td>
        <td><input type="text" name="number" maxlength="40"></td>
    </tr>
    
    <tr>
        <td colspan="2" align="center"><input type="submit" value="Submit"></td>
    </tr> 
</table>
</form>
</body>
</html>