package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class HelloController {
	
	@RequestMapping(value="/add")
   public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
		
	 int p=Integer.parseInt(request.getParameter("principal"));	
	 int t=Integer.parseInt(request.getParameter("time"));	
	 int r=Integer.parseInt(request.getParameter("rate"));	
	 int si=((p*t*r)/100);
	 
	 ModelAndView mv=new ModelAndView();
	 mv.setViewName("display");
	 mv.addObject("result",si);
	 return mv;
		
		
      
  
   }
}
