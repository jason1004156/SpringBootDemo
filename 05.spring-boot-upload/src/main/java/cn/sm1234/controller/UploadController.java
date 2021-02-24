package cn.sm1234.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	Map<String, Object> Result = new HashMap<String, Object>();
	/*
	 * 接收文件
	 */	
	@RequestMapping("uploadAttach")
	public Map<String, Object>upload(@RequestParam("attach")MultipartFile file){
		System.out.println("文件原名稱:" + file.getOriginalFilename());
		System.out.println("文件類型:" + file.getContentType());
		try{
		    
			file.transferTo(new File(file.getOriginalFilename()));
			
			Result.put("success", true);
		}catch(Exception e){
			System.out.println(e.toString());
			Result.put("success", false);
		}
		
		return Result;
	}

}
