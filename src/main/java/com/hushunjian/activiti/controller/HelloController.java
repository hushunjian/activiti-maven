package com.hushunjian.activiti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController("helloController")
@RequestMapping(value="/hello")
public class HelloController {

	@ApiOperation(value="sayHello",notes="sayHello")
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public Object sayHello(){
		System.out.println("hello world!");
		return "hello world!";
	}
	
}
