<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Results</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cerulean/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	
	<div class="card mb-3">
		<h3 class="card-header">Hotels in ${city}</h3>
		<div class="card-body">
			<ul class="list-group list-group-flush">
				<c:forEach var="hotel" items="${hotelresult}">

					<li class="list-group-item">
						<h5 class="card-title">${hotel.name }</h5>
						<h6 class="card-subtitle text-muted">${hotel.pricePerNight }</h6>
					</li>
				</c:forEach>
			</ul>

		</div>
		</div>
</body>
</html>