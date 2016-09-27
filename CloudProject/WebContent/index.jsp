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
<title>Welcome to Prime validator</title>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Prime Validator Page</h1>
  <p>Please Enter the Details in the below table!</p> 
</div>
<form action="MyServlet" method="post" onsubmit="return validateForm()">
<table align="center" class="table table-striped">
    <tr>
        <td colspan="2" align="center">Enter a Number to Validate Prime or not </td>
    </tr>
    <tr>
        <td><p class="bg-primary">Your Name</p> </td>
        <td><input type="text" name="name" maxlength="25" id="name" required></td>
    </tr>
     
    <tr>
        <td>  <p class="bg-info">Number to Validate</p></td>
        <td><input type="text" name="number" maxlength="40" id="number" required></td>
    </tr>
    
    <td colspan="2" align="center"><input type="submit" value="Submit" onclick="return myFunction()"></td>
    
</table>
<script type="text/javascript">
function myFunction()
{
    var inputtxt = document.getElementById('number');
    var letters = /^[A-Za-z]+$/;  
      if(inputtxt.value.match(letters)) 
    {
       alert('Input number is not numeric');
       return false;
    }
    alert('Submitting the details..');
    return true;     
 
}
</script>
</form>
</body>
</html>