<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/common.css" type="text/css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
<script src="js/common.js"></script> 
<script>
	$(function(){
		$("form").submit(function(){
			var result = checkInputEmpty($("input[name]"));
			if(result == false){
				return false;
			}
			
			
		})
	})
</script>
</head>
<body>
<form action="change.do" method="post">
	<fieldset>
	<input type="hidden" name="memberid" value="${Auth }">
   현재 암호 : <input type="password" name="password"> 
   	<c:if test="${notMatch == true }">
    	현재 암호가 일치하지 않습니다.
    </c:if>
    <br>
    새 암호 : <input type="password" name="confirmPassword"><br>
    <input type="submit" value="암호 변경">
    </fieldset>
    </form>
   
</body>
</html>