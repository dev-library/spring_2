<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- form을 생성해보겠습니다.
	action="http://localhost:8181/bmi" 을 그대로 사용합니다. -->
	<form action="http://localhost:8181/bmi" method="post">
		<input type="number" name="height" required/>cm<br/>
		<input type="number" name="kg" required/>kg<br/>
		<input type="submit" value="BMI 측정하기" /><br/>
	</form>
</body>
</html>