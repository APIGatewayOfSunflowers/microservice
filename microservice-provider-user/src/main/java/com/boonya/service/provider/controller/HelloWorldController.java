package com.boonya.service.provider.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class HelloWorldController {
	
	@RequestMapping("/sayHello")
	@ResponseBody
	public Map<String,Object> sayHello(@RequestParam String content){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("header", "header");
		map.put("content", content);
		return map;
	}

}
