<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	section{
		width: 700px;
		margin: 0 auto;
	}
	table,td{
		border:1px solid black;
		border-collapse: collapse;
	}
	tr{
		border:1px solid black;
		border-collapse: collapse;
	}
	
</style>
</head>
<body>
<form>
	<table>
		<c:forEach var="m" items="${list}">
			<tr>
				<td>${m.memberid }</td>
				<td>${m.name }</td>
				<td>${m.password }</td>
				<td>${m.datetime }</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>