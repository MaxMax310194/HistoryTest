<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="goToStartTesting" method="post">
Hello,<c:out value="${userSession.name}"></c:out>
<br/><input type="submit" value="Start Test" />
<br/><input type="submit"  onclick="this.form.action = 'goToUpUser'" value="Update" />
</form>
</body>
</html>