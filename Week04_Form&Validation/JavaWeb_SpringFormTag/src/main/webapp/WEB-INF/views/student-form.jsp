<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag form demo</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName"/>
	<br></br>
	Last name: <form:input path="lastName"/>
	<br></br>
<%-- 	<form:select path="country"> --%>
<%-- 		<form:option value="Da Nang" label="Da Nang" /> --%>
<%-- 		<form:option value="Ho Chi Minh" label="Ho Chi Minh" /> --%>
<%-- 		<form:option value="Ha Noi" label="Ha Noi" /> --%>
<%-- 	</form:select> --%>
	<form:select path="country">
		<form:option items="${student.countryOptions}" value="${student.countryOptions}"/>
	</form:select>
	<br></br>
	Favorite language:
	Java: <form:radiobutton path="favoriteLanguage" value="Java"/>
	C#: <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP: <form:radiobutton path="favoriteLanguage" value="PHP"/>
	Python: <form:radiobutton path="favoriteLanguage" value="Python"/>
	<br></br>
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>