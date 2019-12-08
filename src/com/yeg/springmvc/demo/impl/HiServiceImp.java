package com.yeg.springmvc.demo.impl;

import org.springframework.stereotype.Component;

import com.yeg.springmvc.demo.HelloService;
import com.yeg.springmvc.demo.annotation.Action;

//@Component("helloService")
@Action(value="hiService")
public class HiServiceImp implements HelloService{
	
	
	public String sayHello(String msg){
		return "HI,"+msg;
		
	}
}
