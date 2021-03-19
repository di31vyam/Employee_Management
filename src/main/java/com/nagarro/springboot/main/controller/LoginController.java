package com.nagarro.springboot.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.springboot.main.entity.Employee;
import com.nagarro.springboot.main.service.EmployeeService;
import com.nagarro.springboot.main.service.LoginService;



@Controller
public class LoginController 
{
	@Autowired
	LoginService ls;
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("userid") String userId,@RequestParam("password") String password)
	{
		ModelAndView mv=new ModelAndView();
		if(ls.verify(userId, password))
		{
			List<Employee> l=es.getEmployees();
			mv.addObject("list",l);
			mv.addObject("user",userId);
			mv.setViewName("display");
			return mv;
		}
		mv.addObject("msg","sde");
		mv.setViewName("index");
		return mv;
	}
}
