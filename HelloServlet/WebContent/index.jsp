<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>
<body>
	<input type="button" value="HelloServlet"
			onClick="location.href='HelloServlet'">
	<input type="button" value="WelcomServlet"
			onClick="location.href='welcome.jsp'">
	<input type="button" value="問い合わせ"
			onClick="location.href='inquiry.jsp'">
	<input type="button" value="MySQLServlet"
			onClick="location.href='MySQLServlet'">

	<br><br>

	GET送信
	<form method="get" action="TestServlet"><br>
		<input type="text" name="username"><br>
		<input type="text" name="password"><br>
		<input type="submit" value="送信"><br>
	</form><br>

	POST送信
	<form method="post" action="TestServlet"><br>
		<input type="text" name="username"><br>
		<input type="text" name="password"><br>
		<input type="submit" value="送信"><br>
	</form><br>


</body>
</html>