package com.yeg.springmvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yeg.springmvc.model.User;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value= {"/","/home"})
	public ModelAndView toHome(ModelAndView model) {
		
		User user = new User();
		user.setPassword("testpassword");
		user.setUserName("zhangsan");
		
		model.addObject(user);
		
		model.setViewName("/WEB-INF/views/home.jsp");
		
		return model;
		
	}
}
