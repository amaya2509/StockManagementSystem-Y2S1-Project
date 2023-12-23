<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Page </title>
<link rel="stylesheet" href="css/home.css">
<style>

form{
	width:500px;
	margin:auto;
	padding:60px;
	font-size:20px;
	opacity: 0.8;
	background-color:#C8553C;
}

form h1{
	text-align: center;
	color: #FFFFFF;
}

a:link, a:visited {
  background-color: white;
  color: black;
  border: 2px solid green;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: green;
  color: white;
}
</style>
</head>
<body>
<form>
<center>
	<h1>Login as</h1>
	<a href="adminLogin.jsp">Administrator</a>
    <a href="#">QA Supervisor</a>
    <br><br>
    <a href="#">Inventory Manager</a>
    <a href="supplierlogin.jsp">Supplier</a>
</center>	
</form>

  
</body>
</html>