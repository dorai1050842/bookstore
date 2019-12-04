<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOKSTORE</title>

<link rel = "icon" href="img/logo.png" type="image/x-icon">

<link rel="stylesheet" href="css/style.css">



</head>
<body>

<form action="join.do" method="post">
<div class="loginbox">
<img src="img/close.png" class="close">
	
	<img src="img/loginlogo.png" class="loginlogo">
		<input type="text" name="userid" placeholder="&ensp;아이디">
		<input type="password" name="pwd" placeholder="&ensp;패스워드">
		<input type="password" name="PWD_CHECK" placeholder="&ensp;비밀번호확인">   
		<input type="text" name="name" placeholder="&ensp;이름">
		<input type="text" name="email" placeholder="&ensp;이메일">
		<input type="text" name="phone" placeholder="&ensp;연락처">
		<input type="text" name="admin" placeholder="&ensp;관리자번호">
	

		
		<button type="submit" class="rewrite">회원가입</button>
		<button type="reset" class="rewrite">다시쓰기</button>
	
	 	<br><br><br>
 		아이디가 있으십니까?<a href="loginForm.do">&nbsp;로그인</a>
 		<br><br>
 		<img src="img/or.png" class="or">
 		<br>
 		<p>Sign in with</p>
 		<img src="img/google.png" class="google">
 
		
</div>

</form>





</body>
</html>