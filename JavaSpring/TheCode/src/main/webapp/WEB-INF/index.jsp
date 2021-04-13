<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code</title>
</head>
<body>
	<div class="container">
		<h2><c:out value="${error}"/></h2>
		<h1>What is the code?</h1>
			<form action="/code" method="post">
				<input type="text" name="code"/>
				<input type="submit" value="Try Code" />
			</form>
	</div>
</body>
</html>