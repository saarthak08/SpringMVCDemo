<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
	<title>Form Processed</title>
</head>
<body>
	<h2>Hello World of Spring</h2>
	<br>
	Student name: <%= request.getParameter("studentName") %>
	<br>
	<br>
	<form method="GET" action="processFormInCapitalLetter">
			<input type="hidden" name="studentName" value=<%=request.getParameter("studentName") %>>
			<input type="submit" value="Click Here to see the message.">
	</form>
	
</body>
</html>