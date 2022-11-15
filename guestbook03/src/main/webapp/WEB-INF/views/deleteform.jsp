<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/delete" method="post">
		<input type='hidden' name="no" value="${param.no}">
		<table>
			<tr>
				<td>
					비밀번호: <input type="password" name="password">
				</td>	
				<br>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
		<br>
		<a href="${pageContext.request.contextPath }">메인으로 돌아가기</a>
	</form>
</body>
</html>