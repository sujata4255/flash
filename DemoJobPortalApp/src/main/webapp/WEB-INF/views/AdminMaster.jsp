<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
	<div class="maincontainer">
	   <section class="header">
	         GIRI'S TECH HUB
	   </section>
	   <div  class="lefthandmenu">
	       <ul>
	          <li  class="jobmaster">Job Master
	            <div class="innermenu">
	               <ul>
	                 <li><a href='addnewjob'>Add New Job</a></li>
	                 <li><a href='viewjob'>View Job</a></li>
	                 <li><a href='uploadprofile'>Upload Profile</a></li>
	                 
	               </ul>
	            </div>
	          
	          </li>
	          <li>Candidate Master</li>
	          <li>Logout</li>
	       </ul>
	   </div>
	   
</body>
</html>