<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<h2>Submitted Info:</h2>
		<h2>Name: <c:out value="${name}"/></h2>
		<h2>Dojo Location: <c:out value="${location}"/></h2>
		<h2>Favorite Language: <c:out value="${language}"/></h2>
		<h2>Comment: <c:out value="${comment}"/></h2>
		
		<br />
		<a href="/">Go Back</a>
	</div>
</body>
</html>