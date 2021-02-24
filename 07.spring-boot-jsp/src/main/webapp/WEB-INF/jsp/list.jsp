<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	<h3>用戶列表展示</h3>
	<table border="1">
		<tr>
			<th>編號</th>
			<th>姓名</th>
			<th>年齡</th>
		</tr>
		<c:forEach items="${list}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.age}</td>
		</tr>
		</c:forEach>
		</#list>
	</table>

</body>
</html>