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
		<div class="top">
			<h2 class="left"><a href="/songs/new">Add New</a></h2>
			<h2 class="left"><a href="/search/topten">Top Songs</a></h2>
			<div class="formright">
				<form action="/search" method="post">
					<input class="form" type="submit" value="Search Artists">
					<input class="form" type="search" name="artist" placeholder="Artist">
				</form>
			</div>
		</div>
		<table class="table table-striped table-hover table-bordered tblbrd blkbrd">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Rating</th>
		            <th scope="col">Action</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>