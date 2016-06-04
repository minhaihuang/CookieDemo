package minhaihuang.cookieDemo.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import minhaihuang.cookieDemo.util.WebUtil;

public class GoodsDetialServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取到商品容器
		Map<String,Goods> goods=(Map<String,Goods>)getServletContext().getAttribute("goods");
		//获取点击商品的id
		String goodsId=request.getParameter("goodsId");
		System.out.println(goodsId);
		//获取已经点击过的商品的id集合
		List<String> list=new ArrayList<String>();
		Cookie[] cookies=request.getCookies();
		
		String id=WebUtil.getCookieValue(cookies, "id");
		if(id==null){
			System.out.println(12345);
			id=goodsId;
		}else if(!id.contains(goodsId)){
			id+=","+goodsId;
		}
		
		Cookie cookie=new Cookie("id", id);
		response.addCookie(cookie);
		
		getServletContext().setAttribute("id", id);
		System.out.println(id);
		//获取到目标商品
		Goods destGoods=goods.get(goodsId);
		
		//设置目标商品到全局变量，方便访问
		
		getServletContext().setAttribute("destGoods", destGoods);
		
		//转移请求，转移页面
		request.getRequestDispatcher("/detial.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
