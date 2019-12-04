<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOKSTORE</title>
<link rel="icon" href="img/logo.png" type="image/x-icon">
<link rel="stylesheet" href="css/loginstyle.css">

</head>
<body>


	<form action="login.do">

		<c:choose>
			<c:when test="${result==false }">
				<script>
				window.onload=function(){
					alert("아이디나 비밀번호가 틀립니다. 다시 로그인하세요.");
				}
				
				
				</script>
			</c:when>
		</c:choose>



		<div class="loginbox">
			<img src="img/close.png" class="close"> <img
				src="img/loginlogo.png" class="loginlogo"> <input type="text"
				name="id" placeholder="&ensp;아이디"> <input type="password"
				name="pwd" placeholder="&ensp;패스워드">



			<button type="submit" class="login">로그인</button>
			<br>
			<br>
			<br> 아이디가 없습니까?<a href="joinForm.do">&nbsp;가입하기</a> <br>
			<br>or <br>
			<p>Sign in with</p>
			<img src="img/google.png" class="google">



		</div>



	</form>







</body>
</html>