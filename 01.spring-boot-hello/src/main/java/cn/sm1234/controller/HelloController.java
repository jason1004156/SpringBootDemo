package cn.sm1234.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
@RestController //代替 @Controller @ResponseBody
//@RequestMapping("/hello")
public class HelloController {
	
	private Map<String,Object> result = new  HashMap<String,Object>();
	
	@RequestMapping("/hello")
	//@ResponseBody // 轉換json註解
	public Map<String,Object>hello(){
		
		result.put("name", "eric");
		result.put("gender", "male");
		
		return result;
	}
}
