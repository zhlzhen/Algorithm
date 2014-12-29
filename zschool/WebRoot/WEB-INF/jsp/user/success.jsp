<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  
request.setCharacterEncoding("utf-8");//设置请求的编译为utf-8  
String user=URLEncoder.encode((String)request.getAttribute("user"),"utf-8");//获取用户名  
Cookie cookie=new Cookie("lee",user+"#"+new java.util.Date().toLocaleString());//创建并实例化cookie对象  
cookie.setMaxAge(60*60*24*30);//设置cookie有效期为30天  
response.addCookie(cookie);  
%>
	<script type="text/javascript">window.location.href=\'#\'" </script>

	<h2>登陆结果 : ${op}</h2>
</body>
</html>