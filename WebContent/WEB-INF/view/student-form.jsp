<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>

<!-- When this page is loaded, Spring will call student.getFirstName() & student.getLastName()
	 & when submit button is clicked, Spring will call student.setFirstName() & student.setLastName()
 -->
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br>
		Last Name: <form:input path="lastName"/>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>

</html>