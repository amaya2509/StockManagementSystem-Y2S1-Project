<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>delete </title>
<link rel="stylesheet" href="css/home.css">
<!--  -->
<style>
form{
	width:500px;
	margin:auto ;
	padding:55px;
	background-color: #F0F8FF;
	font-size:15px;
	font-family:Verdana;
	text-align: left-align;
	opacity: 0.8;	
}

div{
   background-color:#F0F8FF;
   margin-right:500px;
   padding:20px;
 }
 
</style>

</head>
<body>

   <%
      String id = request.getParameter("id");
      String firstname = request.getParameter("firstname");
      String lastname = request.getParameter("lastname");
      String mobile = request.getParameter("mobile");
      String companyname = request.getParameter("companyName");
      String companyID = request.getParameter("companyID");
      String email = request.getParameter("email");
      String password = request.getParameter("pass");
   
   %>
<center>
<div>  
</center>
  
   <form action="delete" method="post">
   <h1><center>DELETE ACCOUNT</center></h1>
     
     <table>
     <tr>
     <td>Supplier ID</td>
     <td><input type="text" name="supid" value="<%= id %>" readonly></td>
     </tr>
     <tr>
     <td>Supplier First Name</td>
     <td><input type="text" name="fname" value="<%= firstname %>" readonly></td>
     </tr>
     <tr>
     <td>Supplier Last Name</td>
     <td><input type="text" name="lname" value="<%= lastname %>"readonly></td>
     </tr>
     <tr>
     <td>Phone Number</td>
     <td><input type="text" name="mobile" value="<%= mobile %>"readonly></td>
     </tr>
     <tr>
     <td>Company Name</td>
     <td><input type="text" name="cname" value="<%= companyname %>"readonly></td>
     </tr>
     <tr>
     <td>Company Registration ID</td>
     <td><input type="text" name="cid" value="<%= companyID %>"readonly></td>
     </tr>
     <tr>
     <td>Email</td>
     <td><input type="email" name="email" value="<%= email %>"readonly></td>
     </tr>
     
</table>     
     <br><br><input type="submit" name="submit" value="delete my account">   <br><br><br>
   
   </form>
</div>
</body>
</html>