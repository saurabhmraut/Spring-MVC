package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class HelloController {
	
	@RequestMapping(value="/login")
	
	   public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
			
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		if(password.equals("admin")) {
			String message1="Welcome"+name;
			return new ModelAndView("display","message",message1);
		}
		else {
			return new ModelAndView("error","message","Invalid Password");
		}
			
			
	      
	  
	   }
	}
