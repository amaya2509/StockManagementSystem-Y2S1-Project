<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/home.css">

<style>
form{
	width:500px;
	margin:auto ;
	padding:55px;
	background-color: #F0F8FF;
	font-size:15px;
	font-family:Verdana;
	text-align: center;
	opacity: 0.8;	
}

.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: rgb(255, 128, 128);
   color: white;
   text-align: center;
   font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}


</style>
<title>login</title>
</head>
<body>
	
	<form action="log" method="post">
	
	<h1>LOGIN</h1>
	
		<h5>USERNAME</h5> <input class="box" type="text" name="username" placeholder="enter your username" required><br><br>
	    <h5>PASSWORD</h5> <input class ="box" type="password" name="password" placeholder="enter password" required><br><br>
	    <label style = "color: black">
	    <input type ="checkbox" name ="remember">Remember Me</label><br><br>

		<input type=submit name="submit" style = color:#A26558 value="login"><br><br>
		
		<a class ="link1" href="supplierRegister.jsp">Create account</a>
		

	</form>
	
	<div class="footer">
  <p>SADE.com</p>
</div>

</body>
</html>