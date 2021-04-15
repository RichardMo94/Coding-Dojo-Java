<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>

<!--<c:out value="value"/> -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Title Here</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
        <h1><c:out value="${book.title}"/></h1>
        
			<p>Description: <c:out value="${book.description}"/></p>
			<p>Language: <c:out value="${book.language}"/></p>
			<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
			
		<a href="/book/${book.id}/edit">Edit Book</a><br />
		<a href="/books">Go Back</a> <br />
	<form action="/books/${book.id}" method="post">
	    <input type="hidden" name="method" value="delete">
	    <input type="submit" value="Delete">
	</form>
</body>
</html>