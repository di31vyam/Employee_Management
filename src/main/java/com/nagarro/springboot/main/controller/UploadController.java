package com.nagarro.springboot.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController 
{
	@PostMapping("/uploadC")
	public ModelAndView upload(@RequestParam("username") String user)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println(user);
		mv.addObject("user", user);
		mv.setViewName("upload");
		return mv;
	}
}
