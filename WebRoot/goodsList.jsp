<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,minhaihuang.cookieDemo.bean.Goods"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>商品列表</h1>
		<%
		Map<String,Goods> map=(Map<String,Goods>)getServletContext().getAttribute("goods");
		
		%>
		
		<table border="1" bordercolor="red">
		<tr>
		<td>商品名称</td>
		<td>商品价格</td>
		<td>操作</td>
		</tr>
		<% 
		Collection<Goods> goods=map.values();
		for(Goods good:goods){
		%>
			<tr>
				<td><%=good.getName() %></td>
				<td><%=good.getPrice() %></td>
				<td><a href="/CookieDemo/GoodsDetial?goodsId=<%=good.getId()%>">查看</a></td>
			</tr>
			<%
			
		}
		 %>
		 
	</table>
		 <br/>
		 <br/>
		 <hr/>
		 <h3>商品浏览记录</h3>
		 <% 
		 //获取到浏览商品id组成的字符串
		 	String ids=(String)getServletContext().getAttribute("id");
		 	//切割字符串
		 	if(ids!=null){
		 	String[] s=ids.split(",");
		 	for(int i=0;i<s.length;i++){
		 		String name=map.get(s[i]).getName();
				out.print(name+"，");
		 	}
		 	}
		  %>

</body>
</html>