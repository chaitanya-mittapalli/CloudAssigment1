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
<title>Weather</title>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Weather Infomation Page</h1>
  <p>Please Enter the City Details in the below table to get the Weather Information!</p> 
</div>
<form action="WeatherServlet" method="post">
<table align="center" class="table table-striped">
    <tr>
        <td colspan="2" align="center">Enter a City from the below Drop Down </td>
    </tr>
    <tr align="center">
        <td><p class="bg-primary" align="center">                  city</p> </td>
        <td>
        <select name="city" id="city">
 		<option value="chicago">Chicago</option>
  		<option value="newyork">New York</option>
  		<option value="losangeles">Los Angeles</option>
  		<option value="washington">Washington D.C</option>
  		<option value="columbus">Columbus</option>
  		<option value="cincinnati">Cincinnati</option>
  		<option value="charlotte">Charlotte</option>
  		 <option value="atlanta">Atlanta</option>
		</select>
        </td>
    </tr>
     
   
    
    <td colspan="2" align="center"><input type="submit" value="Submit" onclick="return myFunction()"></td>
    
</table>
<script type="text/javascript">
function myFunction()
{
   
    alert('Submitting the details..');
    return true;     
 
}
</script>
</form>
</body>
</html>