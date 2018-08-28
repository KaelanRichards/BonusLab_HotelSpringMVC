<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Search</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cerulean/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<h1>Hotel Search</h1>
	<h5>City</h5>
	<div class="container">
		<form action="/result" method="post">
			<select name="city">
				<c:forEach var="c" items="${city }">
					<option value="${c }">${c }</option>
			</c:forEach>	
			</select> 
			
			<button type="submit" class="btn btn-primary">GO</button>
		</form>
	</div>
</body>
</html>