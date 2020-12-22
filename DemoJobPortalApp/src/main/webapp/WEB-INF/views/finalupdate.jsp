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
		<form name="frm" action="finalupdate" method="GET">
			<ul>
			   
				<li><input type='hidden' name='id' value='${jid}'
					class="logincontrol" /></li>
				
				<li><input type='text' name='name' value='${name}'
					placeholder='Company Name ' class="logincontrol" /></li>
				<li><input type='text' name='pack' value='${pack}'
					placeholder='Package' class="logincontrol" /></li>
				<li><input type='text' name='location' value='${loc}'
					placeholder='Location' class="logincontrol" /></li>
				<li><textarea name="desc" placeholder='Enter Job Description'
						class="logincontrol">${desc}</textarea></li>
				<li><input type='date' name='lasttoapply' value='${dapply}'
					placehoder='Last Date To Apply' class="logincontrol" /></li>
				<li><input type='submit' name='s' value='Update Job'
					class="logincontrol" /></li>
				<li>${msg}</li>

			</ul>
		</form>
	</div>
	</div>

</body>
</html>