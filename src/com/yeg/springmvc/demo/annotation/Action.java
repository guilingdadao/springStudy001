package com.yeg.springmvc.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
@Component
@Scope(value="prototype")
public @interface Action {
	public java.lang.String value() default "";
}
