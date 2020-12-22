<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
  function search(){
	  
	  var xhttp;
	 var str=document.getElementById("sname").value;
	
	  xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    document.getElementById("txtHint").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("GET", "searchspecific?name="+str, true);
	  xhttp.send();
  }
</script>
</head>
<body>
 <jsp:include page="master.jsp"></jsp:include>
 <br><br>
 <input type='text' name='s' value='' id='sname' style='width:400px;height:30px' onkeyup="search()"/>
 <br><br>
 
 <div id="txtHint">
    
 </div>
</body>
</html>