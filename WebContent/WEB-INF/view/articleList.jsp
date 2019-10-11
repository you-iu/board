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
	tr,th{
		border:1px solid black;
		border-collapse: collapse;
	}
	
</style>
</head>
<body>
	<p>
		<a href="add.do">등록하기</a>
	</p>
	<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
	</tr>
		<c:forEach var="a" items="${list }">
			<tr>
				<td>${a.article_no }</td>
				<td><a href="read.do?no=${a.article_no }">${a.title }</a></td>
				<td>${a.writer_name }</td>
				<td>${a.read_cnt }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>