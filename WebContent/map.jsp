<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/map.action" method="post">
	<!-- ����keyֵmap['keyֵ']
		����valueֵ
	 -->
	
		username:<input type="text" name="map['one'].username"/><br/>
		password:<input type="text" name="map['one'].password"/><br/>
		address:<input type="text" name="map['one'].address"/><br/>
		<br/><br/>
		username:<input type="text" name="map['two'].username"/><br/>
		password:<input type="text" name="map['two'].password"/><br/>
		address:<input type="text" name="map['two'].address"/><br/>
		<input type="submit" value="�ύ"/>
	</form>

</body>
</html>