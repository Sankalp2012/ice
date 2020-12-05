package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
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
		//mv.setViewName("test.jsp");
		//String uname="";
		//Optional<users> u=user.findById(uname);
		Optional<users> optional = user.findById(uname);
		
		optional.ifPresent(user -> {
			if(psw.equals(user.getPsw())) {
				mv.setViewName("test.jsp");
				mv.addObject("u", user.getUname()); 
		}
			else {
				mv.setViewName("index.jsp");
				mv.addObject("u", "incorrect password");
			}
		});
		
		return mv;
	}
	@RequestMapping("signup")
	public String signup(@ModelAttribute("u1") users u) {
		/*
		users u=new users();
		u.setPno(pno);
		u.setPsw(psw);
		u.setUname(uname);
		*/
		user.save(u);
		return "index.jsp";
	}
	
}
