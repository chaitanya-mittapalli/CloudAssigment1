<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="org.json.simple.*"%>
<%@page import="org.json.*"%>

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
    JSONObject jsonObject=new JSONObject(request.getAttribute("info").toString());
	JSONObject coard=(JSONObject)jsonObject.get("coord");
    JSONArray jsonArray=jsonObject.getJSONArray("weather");
    JSONObject main=(JSONObject)jsonObject.get("main");
%>
<div class="alert alert-success">
    <strong>Success!</strong> Please check the below Result Window for Details
  </div>
<table align="center" bgcolor="##99ABCD" border="1" width="50%">
    <tr >
         <td colspan="2" align="center"> <span class="label label-success"><%="Hi "+jsonObject.get("name")+" !!!!. Weather Infomation Processed." %></span></td>
    </tr>
    <tr>
        <td>Longitude of <%=jsonObject.get("name")%> </td>
        <td><%=coard.get("lon")%></td>
    </tr>
     <tr>
        <td>Latitude of <%=jsonObject.get("name")%> </td>
        <td><%=coard.get("lat")%></td>
    </tr>
    <tr>
        <td>Weather Description  </td>
        <% for(int i=0;i<jsonArray.length();i++) { %>
        <td><%=jsonArray.getJSONObject(i).getString("description")%></td>
        <%} %>
    </tr>
    <tr>
        <td>Maximum Temperature in Centigrade </td> 
        <td><%=main.get("temp_max")%></td>
    </tr>
      <tr>
        <td>Minimum Temperature in Centigrade </td> 
        <td><%=main.get("temp_min")%></td>
    </tr>
   
   
</table>

 <ul class="pager">
  <li><a href="weather.jsp">Click here to redirect</a></li>
</ul>
</html>