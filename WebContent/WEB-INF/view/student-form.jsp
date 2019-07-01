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
		Country: 
		<form:select value="Country" path="country">
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="Argentina" label="Argentina"/>
			<form:option value="France" label="France"/>
			<form:option value="India" label="India"/>
			<form:option value="Germany" label="Germany"/>
		</form:select>
		<input type="submit" value="Submit">
	</form:form>
	
</body>

</html>