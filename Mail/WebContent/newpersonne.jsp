<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  method="post" action="CreerPersonne"> 
		<label>login </label> <input type="text" name="login"> <br>	
	    <label> Pass <input type="password" name="mdp"> </label> <br>
	    <label> Nom <input type="text" name="nom"> </label> <br>
	    <label> Prenom <input type="text" name="prenom"> </label> <br>
		<label> adresse email <input type="email" name="mail"> </label> <br>
		<label> Num tél  <input type="number" name="tel"> </label> <br>
		<br>
		<button type="submit">Submit</button>
		
	</form> 
</body>
</html>