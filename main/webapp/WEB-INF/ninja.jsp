<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo and Ninjas</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>New Ninja</h2>
	<form:form action="/ninja" method="post" modelAttribute="ninja">
		<form:label path="dojo">Dojo</form:label>
			<h4 class="ninja"><form:select path="dojo">
				<c:forEach items="${dojo}" var="d">
					<p><form:option value="${d.id}"><c:out value="${d.name}"/></form:option></p>
				</c:forEach>
			</form:select></h4>
			<h4 class="ninja"><form:label path="firstName">First Name:</form:label></h4>
			<form:input path="firstName"/>
			<h4 class="ninja"><form:label path="lastName">Last Name:</form:label></h4>
			<form:input path="lastName"/>
			<h4 class="ninja"><form:label path="age">Age:</form:label></h4>
			<form:input type="number" path="age"/><br>
			<input type="submit" value="Create">
		</form:form>
</body>
</html>