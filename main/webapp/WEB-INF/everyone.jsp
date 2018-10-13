<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo and Ninjas</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Burbank Location Ninjas</h2>
	<div id="container">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${ninjas}" var="n">
			<tr>
				<td><c:out value="${n.firstName}"/></td>
				<td><c:out value="${n.lastName}"/></td>
				<td><c:out value="${n.age}"/></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>