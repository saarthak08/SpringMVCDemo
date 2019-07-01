<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page isELIgnored="false" %>

<html>

<head>

	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

</head>

 <body>

<h2>Spring MVC Demo - Home Page</h2>

<a href="helloWorld/showForm">Go to HelloWorld form!</a>

<br>

<a href="student/showForm">Go to student form!</a>

<br><br>

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />

<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>

</html>





