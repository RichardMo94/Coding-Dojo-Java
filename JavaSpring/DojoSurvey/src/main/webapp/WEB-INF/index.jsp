<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<form action="/results" method="post">
		<label for="name">Your Name:</label>
		<input type="text" name="name" /><br/>
		<label for="location">Dojo Location:</label>
		<select name="location">
			<option value="sanjose">San Jose</option>
			<option value="Boise">Boise</option>
			<option value="Chicgao">Chicago</option>
			<option value="Dallas">Dallas</option>
  			<option value="Burbank">Burbank</option>
		</select><br />
		<label for="language">Favorite Language:</label>
		<select name="language">
			<option value="python">Python</option>
			<option value="java">Java</option>
			<option value="mern">MERN</option>
			<option value="c++">C++</option>
		</select> <br />
		<label for="comment">Comment (optional):</label>
		<textarea name="comment"cols="30" rows="5"></textarea>
		<input type="submit" />
	</form>
</body>
</html>