<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Form</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	<br>
	Country: ${student.country}
	<br>
	<br>
	Favourite Language: ${student.favouriteLanguage}
	<br>
	<br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.favouriteOperatingSystem}">
			<li> ${temp }</li>
			</c:forEach>
	</ul>
</body>
</html>