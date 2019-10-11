<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update.do" method="post">
		번호:<br>
		<input type="text" name="no" readonly="readonly" value="${article.article_no }">
		제목:<br>
		<input type="text" name="title" value="${article.title }"><br>
		내용:<br>
		<textarea rows="15" cols="30" name="content">${article.content }</textarea>
		<input type="submit" value="글 수정">
	</form>
</body>
</html>