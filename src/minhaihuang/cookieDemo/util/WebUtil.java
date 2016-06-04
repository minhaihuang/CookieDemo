package minhaihuang.cookieDemo.util;

import javax.servlet.http.Cookie;

/**
 * 创建一个web的util类，方便使用
 * @author 黄帅哥
 *
 */
public class WebUtil {

	/**
	 * 获得某个特定的cookie的内容
	 * @param cookies
	 * @param cookieName
	 * @return
	 */
	public static String getCookieValue(Cookie[] cookies,String cookieName){
		
		//如果cookies等于空，直接返回空
		if(cookies==null){
			return null;
		}
		//遍历所有的cookie
		for(Cookie cookie:cookies){
			if(cookie.getName().equals(cookieName)){
				return cookie.getValue();//返回值
			}
		}
		
		return null;
	}
}
