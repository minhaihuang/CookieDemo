<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="minhaihuang.cookieDemo.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//获取到目标商品
		Goods destGoods=(Goods)getServletContext().getAttribute("destGoods");
	 %>
	 <table>
	   	<tr><td>商品名称</td><td><%=destGoods.getName() %></td><tr>
	   	<tr><td>商品价格</td><td><%=destGoods.getPrice() %></td><tr>
	   	<tr><td>商品描述</td><td><%="很耐用" %></td><tr>
	   	<tr><td>商品图片</td><td><%="xxxxxxx" %></td><tr>
	 </table>
	 <a href="/CookieDemo/GoodsLists">返回商品列表</a>
</body>
</html>