<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${userid }으로 로그인 하셨슴다<br>
	${name } 님 환영합니다 <br>
	연락처 : ${phone } <br>
	이메일 : ${email } <br>
	
	<input type="button" value="로그아웃" onclick="location.href='logout.do'">
	<input type="button" value="모든회원보기" onclick="location.href='memberList.do'">
	<input type="button" value="회원정보수정" onclick="location.href='memberUpdateForm.do'">
</body>
</html>