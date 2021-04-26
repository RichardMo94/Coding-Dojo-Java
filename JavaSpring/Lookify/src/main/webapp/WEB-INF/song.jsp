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
        <div class="container">
		<div class="top1">
			<h2 class="right"><a href="/dashboard">Dashboard</a></h2>
		</div>
		<h2>Title:  <c:out value="${song.title}"/></h2>
		<h2>Artist:  <c:out value="${song.artist}"/></h2>
		<h2>Rating (1-10):  <c:out value="${song.rating}"/></h2>
		<h2><a href="/delete/${song.id}">Delete</a></h2>
	</div>
</body>
</html>