<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"  href="css/home.css"> 
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
<title> Register</title>
</head>
<body>

   <form action="insert" method="post">
   <h1>SUPPLIER REGISTRATION</h1>
   
   <h5>First Name</h5> <input class="box" type="text" name="firstname" placeholder=" First Name" required><br>
   <h5>Last Name</h5> <input class ="box" type="text" name="lastname" placeholder="enter password" required><br>
   <h5>Mobile Number</h5> <input class="box" type="text" name="mobile" placeholder="07XXXXXXXX" required><br>
   <h5>Company Name </h5> <input class ="box" type="text" name="companyname" placeholder="enter company name" ><br>
   <h5>Company RegistrationID</h5> <input class="box" type="text" name="companyID" placeholder=" enter company registration ID" ><br>
   <h5>Email</h5> <input class ="box" type="email" name="email" placeholder="abc@gmail.com" required><br>
   <h5>Password</h5> <input class="box" type="text" name="password" placeholder=" enter password" required><br><br>
   
   <input type="checkbox" value="accept">Accept privacy policy and terms<br><br>
	
	<input type="submit" value="register"  >
	
   
   </form>

<div class="footer">
  <p>SADE.com</p>
</div>

</body>
</html>