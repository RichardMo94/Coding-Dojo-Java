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
        <div id="container">
		<div id="leftpanel">
			<h1><c:out value="${product.name}"/></h1>
			<h2>Categories:</h2>
			<c:forEach items="${product.categories}" var="cat">
				<h3>-<c:out value="${cat.name}"/></h3>
			</c:forEach>
		</div>
		<div id="rightpanel">
			<form:form action="/attachcategory" method="post" modelAttribute="categoryProductObj">
			    <h2>
			        <form:label cssClass="label left" path="category">Add Category:</form:label>
   			    	<form:select cssClass="box" path="category">
   			    		<c:forEach items="${categories}" var="cat">
   			    			<form:option value="${cat.id}"><c:out value="${cat.name}"/></form:option>
		    			</c:forEach>
 			    	</form:select>
			    </h2>
			    <form:hidden path="product" value="${product.id}" />
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		</div>
	</div>
</body>
</html>