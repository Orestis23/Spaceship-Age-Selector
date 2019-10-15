<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age Selection</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/darkly/bootstrap.min.css">
</head>
<body>
	<form>
		Age:<input type="text" name="age" placeholder="age"><br>
		<button type="submit" formaction="/submit-age">Submit Age</button>
	</form>
</body>
</html>