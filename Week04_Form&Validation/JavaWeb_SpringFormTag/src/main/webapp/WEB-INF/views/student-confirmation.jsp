<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country is: ${student.country}
	<br><br>
	Favorite language is: ${student.favoriteLanguage}
</body>
</html>