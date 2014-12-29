<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="java.net.URLDecoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>通过cookie保存并读取用户登陆信息</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();//从request中获得cookie对象的集合
		String user = "";//登录用户
		String date = "";//注册时间
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("lee")) {
					user = URLDecoder.decode(cookies[i].getValue().split("#")[0]);//获取用户名
					date = cookies[i].getValue().split("#")[1];//获取注册时间

				}
			}

		}
		if ("".equals(user) && "".equals(date)) { //如果没有注册
	%>
	游客你好，欢迎你初次光临！
	 <form action="login" method="post">
        <br>用户名称：<input  type="text" name="username" value=""/>
   		<br>用户密码：<input  type="text" name="password" value=""/>
   		<br><input type="submit" value="提交" />
     </form>
	<%
		} else { //已经注册
	%>
	欢迎[ <b><%=user%><b>]再次光临<br> 你注册的时间是：<%=date%> <%
 	}
 %>
</body>
</html>