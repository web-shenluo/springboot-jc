package com.jc.jwms.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	private String message = "Hello World";  
	
	@RequestMapping("/index")
	public String getIndex(Map<String, Object> model){
		 model.put("time", new Date());  
         model.put("message", this.message);  
         return "index";  
	}

}
