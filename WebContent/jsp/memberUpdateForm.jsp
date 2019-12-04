<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="memberUpdate.do">
		<table>
		<tr>
		<td><input type="text" name="userid" value="${userid }"> </td>
		</tr>
		<tr>
		<td><input type="password" name="pwd" value=""> </td>
		</tr>
		<tr>
		<td><input type="password" name="PWD_CHECK" value=""> </td>
		</tr>
		<tr>
		<td><input type="text" name="name" value="${name }"> </td>
		</tr>
		<tr>
		<td><input type="text" name="email" value="${email }"> </td>
		</tr>
		<tr>
		<td><input type="text" name="phone" value="${phone }"> </td>
		</tr>

		<tr>
		<td colspan="2" align="center"> <input type="submit" value="수정하기"> 
		<input type="reset" value="다시">	</td>
		</tr>
		
		
		
		
		
		
		
		
		</table>
	
	
	
	
	
	
	</form>




</body>
</html>