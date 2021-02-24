package cn.sm1234.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sm1234.domain.User;

@Controller
public class UserController {

	/*
	 * 用戶列表展示
	 */
	@RequestMapping("/list")
	public String list(Model model){
		//模擬用戶資料
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"小張",18));
		list.add(new User(2,"小徐",20));
		list.add(new User(3,"小陳",22));
		
		//資料存入model
		model.addAttribute("list",list);
		
		//跳轉道freemarker頁面list.ftl
		return "list";
	}
}
