<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

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
<div id="table">

        <h1>Languages</h1>
        <table>
        	<thead>
        		<tr>
        			<th>Name</th>
        			<th>Creator</th>
        			<th>Version</th>      		
        		</tr>
        	</thead>
        	<tbody>
        		<c:forEach items="${allLanguages}" var="language">
        			<tr>
        				<td>
        					<a href="/languages/${language.id }"><c:out value="${language.name }"/></a>
        				</td>
        				<td>
        					<c:out value="${language.creator }"/>
        				</td>
        				<td>
        					<c:out value="${language.version }"/>
        				</td>
        				<td>
        					<form action="/languages/${language.id }" method="post" >
        						<input type="hidden" name="_method" value="delete">
        						<button type="submit">Delete</button>
        					</form>
        				</td>
        				<td>
        					<a href="/languages/edit/${language.id }">Edit</a>
        				</td>
        			</tr>
        		</c:forEach>
        	</tbody>
        </table>
</div> 

<div id="create">
	<form:form action="/languages/new" method="POST" modelAttribute="language">
		<p>
			<form:label path="name">Name:</form:label>
			<form:input path="name"/>
			<form:errors path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:input path="creator"/>
			<form:errors path="creator"/>
		</p>
		<p>
			<form:label path="version">Version:</form:label>
			<form:input path="version"/>
			<form:errors path="version"/>
		</p>
		<button type="submit">Create Language</button>
	</form:form>       
</div>
</body>
</html>