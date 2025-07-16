package com.example.mn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String getIt()
	{
		return "hello render";
	}
	
	@RequestMapping("/hello")
	public String getIt1()
	{
		return "hello render all";
	}

}
