package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/demo1")
	public String demo1(Model model){
		model.addAttribute("message", "你好，Thymeleaf");
		//跳轉道demo1.html頁面
		return "demo1";
	}
}
