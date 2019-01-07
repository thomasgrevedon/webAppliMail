<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  method="post" action="Toto"> 
		<label>login </label> <input type="text" name="login"> <br>	
	    <label> Mot de passe <input type="password" name="mdp"> </label> <br>
	    <%if (request.getParameter("erreur") != null && "True".equals(request.getParameter("erreur"))) { %>
		
		<font color="red">Mauvais mot de passe</font>
		
		<% }%>
		<br>
		<button type="submit">Submit</button>
		
	</form> 
</body>
</html>