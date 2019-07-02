<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
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
		<br> <br>
		Country: 
		<form:select path="country">
			<form:options items="${theCountryOptions}"/>
		</form:select>
		<br> <br>
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		C <form:radiobutton path="favouriteLanguage" value="C"/>
		C++ <form:radiobutton path="favouriteLanguage" value="C++"/>
		PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
		JavaScript <form:radiobutton path="favouriteLanguage" value="JavaScript"/>
		<br> <br>
		Operating Systems:
		Linux <form:checkbox path="favouriteOperatingSystem" value="Linux"/>
		MacOS <form:checkbox path="favouriteOperatingSystem" value="MacOS"/>
		Windows <form:checkbox path="favouriteOperatingSystem" value="Windows"/>
		<br> <br>
		<input type="submit" value="Submit">
	</form:form>
	
</body>

</html>