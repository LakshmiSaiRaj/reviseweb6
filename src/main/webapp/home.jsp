<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/addMan">
	<input type="text" name="aid">
	<input type="text" name="aname">
	<input type="text" name="atech">
	<input type="submit">
	</form>
	<form method="get" action="/fetchMan">
	<input type="text" name="aid">
	<input type="submit">
	</form>
</body>
</html>