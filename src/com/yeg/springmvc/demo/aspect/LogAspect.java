package com.yeg.springmvc.demo.aspect;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class LogAspect {
	
	@Before("execution(* com.yeg.springmvc.demo.HelloService.sayHello(..))")
//	@AfterReturning("execution(* com.yeg.springmvc.demo.HelloService.sayHello(..))")
//	@Before("@annotation(com.yeg.springmvc.demo.annotation.Action)")
	public void print(){
		DateFormat df = new SimpleDateFormat("yyyyy-MM-dd hh:mm:ss");
		
		System.out.println("开始执行"+ df.format(new Date()));
		
	}
}
