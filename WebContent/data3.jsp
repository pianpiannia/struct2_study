<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/data3.action" method="post">
		username:<input type="text" name="user.username"/><br/>
		password:<input type="text" name="user.password"/><br/>
		address:<input type="text" name="user.address"/><br/>
		<input type="submit" value="提交"/>
	</form>

</body>
</html>