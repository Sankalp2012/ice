package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
	
	@Autowired
	User user;
	
	@RequestMapping("/")
	public String welcome() {
		return "index.jsp";
	}
	
	
	@RequestMapping("login")
	public ModelAndView login(ModelAndView mv,@RequestParam("uname") String uname,@RequestParam("psw") String psw) {
		//System.out.println("hello");
		mv.setViewName("test.jsp");
		mv.addObject("u", user.findAll());
		return mv;
	}
	@RequestMapping("signup")
	public String signup(@ModelAttribute("u") users u) {
		/*
		users u=new users();
		u.setPno(pno);
		u.setPsw(psw);
		u.setUname(uname);
		*/
		user.save(u);
		return "test.jsp";
	}
}
