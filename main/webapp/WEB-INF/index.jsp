<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo and Ninjas</title>
</head>
<body>
	<h2>New Dojo</h2>
	<form:form action="/dojo" method="post" modelAttribute="dojo">
		<h3><form:label path="name">Name</form:label>
			<form:input path="name"/>
		</h3>
		<input type="submit" value="Create">
	</form:form>
</body>
</html>