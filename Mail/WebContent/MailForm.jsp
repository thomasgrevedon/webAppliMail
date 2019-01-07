<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  method="post" action="Mailtosend"> 
		<label>destinataire </label> <input type="email" name="dest"> <br>	
	    <label> objet <input type="text" name="obj"> </label> <br>
	    <label> Message <input type="text" name="mess"> </label> <br>
		
		<br>
		<button type="submit">Submit</button>
		
	</form> 
</body>
</html>