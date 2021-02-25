package cn.sm1234.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sm1234.domain.User;

@Controller
public class UserController {

	@RequestMapping("/demo1")
	public String demo1(Model model){
		model.addAttribute("message", "你好，Thymeleaf");
		//跳轉道demo1.html頁面
		return "demo1";
	}
	
	//變量輸出
	@RequestMapping("/demo2")
	public String demo2(Model model){
		model.addAttribute("name", "張三");
		//跳轉道demo2.html頁面
		return "demo2";
	}
	
	//條件判斷
	@RequestMapping("/demo3")
	public String demo3(Model model){
		model.addAttribute("gender", "女");
		
		model.addAttribute("grade", "2");
		//跳轉道demo2.html頁面
		return "demo2";
	}
	
	//迭代遍歷
	@RequestMapping("/demo4")
	public String demo4(Model model){
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"小張",18));
		list.add(new User(2,"小徐",20));
		list.add(new User(3,"小陳",22));
		
		model.addAttribute("list",list);
		//跳轉道demo2.html頁面
		return "demo2";
	}
	
	//域對象的獲取
	@RequestMapping("/demo5")
	public String demo5(HttpServletRequest request,Model model){
		
		//request
		request.setAttribute("request", "request's data");
		
		//session
		request.getSession().setAttribute("session", "session's data");
		
		//application
		request.getSession().getServletContext().setAttribute("application",  "application's data");
		
		return "demo2";
	}
	
}

