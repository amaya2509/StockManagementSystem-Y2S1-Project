<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/home.css">
<style>

div{
   background-color:#F0F8FF;
   margin-right:500px;
 }
table{
	width:500px;
	margin:auto ;
	padding:55px;
	background-color: #F0F8FF;
	font-size:15px;
	font-family:Verdana;
	text-align: left;
	opacity: 0.8;
}

</style>
<title>supplier details</title>
</head>
<body>
<center>
<div>
</center>

<table >

   <c:forEach var ="sup" items="${supDetails}">
   
   <c:set var="id" value="${sup.sid}"/>
   <c:set var="fname" value="${sup.firstname}"/>
   <c:set var="lname" value="${sup.lastname}"/>
   <c:set var="mobile" value="${sup.mobile}"/>
   <c:set var="cname" value="${sup.companyName}"/>
   <c:set var="cid" value="${sup.companyID}"/>
   <c:set var="email" value="${sup.email}"/>
   <c:set var="pwd" value="${sup.password}"/>
   
   <th>MY DETAILS</th>
   <tr>
   <td>Supplier ID</td>
   <td> ${sup.sid}</td>
   </tr>
   <tr>
   <td>Supplier First Name</td>
   <td>${sup.firstname}</td>
   </tr>
   <tr>
   <td>Supplier Last Name</td>
   <td>${sup.lastname}</td>
   </tr>
   <tr>
   <td>Phone Number</td>
   <td>${sup.mobile}</td>
   </tr>
   <tr>
   <td>Company Name</td>
   <td>${sup.companyName}</td>
   </tr>
   <tr>
   <td>Company ID</td>
   <td>${sup.companyID}</td>
   </tr>
   <tr>
   <td>Email</td>
   <td>${sup.email}</td>
   </tr>
   <tr>
   <td>Password</td>
   <td>${sup.password}</td>
   </tr>
   
   </c:forEach>
</table>

<c:url value="updateSupplier.jsp" var="supplierupdate">
   <c:param name="id" value="${id}"/>
   <c:param name="firstname" value="${fname}"/>
   <c:param name="lastname" value="${lname}"/>
   <c:param name="mobile" value="${mobile}"/>
   <c:param name="companyName" value="${cname}"/>
   <c:param name="companyID" value="${cid}"/>
   <c:param name="email" value="${email}"/>
   <c:param name="pass" value="${pwd}"/>
</c:url>

<a href="${supplierupdate}">
<center><input type="button" name="update" value="update data"></center>
</a>
<br><br>

<c:url value="deleteSupplier.jsp" var="supdelete">
   <c:param name="id" value="${id}"/>
   <c:param name="firstname" value="${fname}"/>
   <c:param name="lastname" value="${lname}"/>
   <c:param name="mobile" value="${mobile}"/>
   <c:param name="companyName" value="${cname}"/>
   <c:param name="companyID" value="${cid}"/>
   <c:param name="email" value="${email}"/>
   <c:param name="pass" value="${pwd}"/>
</c:url>
<a href="${supdelete}">
<center><input type="button" name="delete" value="delete my account"></center>
</a>
<br><br>
</div>
</body>
</html>