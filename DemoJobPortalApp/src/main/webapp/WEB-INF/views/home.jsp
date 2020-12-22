<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>

	<div class="loginwindow">
		<form name='frm' action='validate' method='POST'>
			<ul>
				<li><input type='text' name='name' value=''
					class="logincontrol" /></li>
				<li><input type='password' name='pass' value=''
					class="logincontrol" /></li>
				<li><input type='submit' name='s' value='Login'
					class="logincontrol" /></li>
				<li><span class="logincontrol"
					style='color: white; font-size: 18px;'>${msg}</span></li>

			</ul>
		</form>
	</div>
</body>
</html>
