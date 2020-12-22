<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Job Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css"/>

</head>
<body>
	
	<jsp:include page="AdminMaster.jsp"></jsp:include>
	<div class="container">
	<form name="frm" action="" method="post">
	<div class="card">
  <div class="card-header text-center font-weight-bold">
    View Job
  </div>
  <div class="card-body">
   <table class="table table-bordered table-hover table-sm" id="table_id">
			<thead>
				<tr>
					
					<th scope="col">Company Name</th>
					<th scope="col">Package</th>
					<th scope="col">Location</th>
					<th scope="col">Job Description</th>
					<th scope="col">Last date to Apply</th>
					<th>DELETE</th>
					<th>UPDATE</th>				
				</tr>
			</thead>
			<tbody>
				
				<c:forEach var="jobmodel" items="${jobList }">
				<tr>
				<td>${jobmodel.getName()}</td>
				<td>${jobmodel.getPack()}</td>
				<td>${jobmodel.getLocation()}</td>
				<td>${jobmodel.getDesc()}</td>
				<td>${jobmodel.getLasttoapply()}</td>
				<td><a href=' '>DELETE</a></td>
				<td><a href=' '>UPDATE</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
  </div>
  </form>
</div>
</div>
		
	

</body>
</html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js"></script>
<script type="text/javascript">
$(document).ready( function () {
    $("#table_id").DataTable();
} );
</script>