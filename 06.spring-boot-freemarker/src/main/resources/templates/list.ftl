<html>
	<title>用戶列表</title>
	<meta charsety="utf-8"/>
	<body>
		<h3>用戶列表展示</h3>
		<table>
			<tr>
				<th>編號</th>
				<th>姓名</th>
				<th>年齡</th>
			</tr>
			<#list list as user>
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
			</tr>
			</#list>
		</table>
	</body>
</html>