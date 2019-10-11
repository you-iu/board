<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>번호</td>
			<td>${article.article_no }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${article.writer_id }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${article.title }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${article.content }</td> 
		</tr>
		<tr>
			<td colspan="2"><a href="list.do">[목록]</a><a href="update.do?no=${article.article_no }">[게시글수정]</a><a href="delete.do?no=${article.article_no }">[게시글삭제]</a></td>
		</tr>
	</table>
</body>
</html>