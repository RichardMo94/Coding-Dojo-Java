<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
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
	<h1>Show Page</h1>
        <h2>Name: <c:out value="${language.name }"/></h2>
        <h2>Creator: <c:out value="${language.creator }"/></h2>
        <h2>Version: <c:out value="${language.version }"/></h2>
        <br />
        <p><a href="/languages">Go Home!</a></p>
        <br />
        <form action="/languages/${language.id }" method="post" >
        	<input type="hidden" name="_method" value="delete">
        	<button type="submit">Delete</button>
        </form>
        <p><a href="/languages/edit/${language.id}">Edit</a></p>
</body>
</html>