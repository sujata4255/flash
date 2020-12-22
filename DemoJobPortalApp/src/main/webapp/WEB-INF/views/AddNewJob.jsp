<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="AdminMaster.jsp"></jsp:include>

	<div class="formarea">
		<form name="frm" action="savejob" method="GET">
			<ul>
			
				<li><input type='hidden' name='name' value='${jid}'
					class="logincontrol" /></li>
			
				<li><input type='text' name='name' value=''
					placeholder='Company Name ' class="logincontrol" /></li>
				<li><input type='text' name='pack' value=''
					placeholder='Package' class="logincontrol" /></li>
				<li><input type='text' name='location' value=''
					placeholder='Location' class="logincontrol" /></li>
				<li><textarea name="desc" placeholder='Enter Job Description'
						class="logincontrol"></textarea></li>
				<li><input type='date' name='lasttoapply' value='${dapply}'
					placehoder='Last Date To Apply' class="logincontrol" /></li>
				<li><input type='submit' name='s' value='Add New Job'
					class="logincontrol" /></li>
				<li>${msg}</li>

			</ul>
		</form>
	</div>
	</div>
</body>
</html>