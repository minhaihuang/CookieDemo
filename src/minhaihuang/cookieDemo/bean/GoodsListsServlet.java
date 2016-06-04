package minhaihuang.cookieDemo.bean;
/**
 * 模仿商品浏览记录
 */
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模仿商品浏览记录
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodsListsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setHeader("Pragma","No-cache"); 
		response.setHeader("Cache-Control","no-cache"); 
		response.setDateHeader("Expires", 0); 
		//创建一个容器，存储数据
		Map<String,Goods> goods=new HashMap<String,Goods>();
		goods.put("001", new Goods("001","杯子",8));
		goods.put("002", new Goods("002","电脑",5000));
		goods.put("003", new Goods("003","眼镜",200));
		goods.put("004", new Goods("004","电脑",30));
		goods.put("005", new Goods("005","苹果手机",6000));
		goods.put("006", new Goods("006","苹果",6));
		
		//设置到全局变量
		getServletContext().setAttribute("goods", goods);
		
		//转转移请求
		request.getRequestDispatcher("/goodsList.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
