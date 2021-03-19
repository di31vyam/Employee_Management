package com.nagarro.springboot.main.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.springboot.main.entity.Employee;
import com.nagarro.springboot.main.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeService es;
	
	
	
	@PostMapping("/update")
	public ModelAndView udpate(@RequestParam("user") String user,@RequestParam("id") int id,
			@RequestParam("Name") String name,@RequestParam("Loc") String loc,@RequestParam("email") String email,
			@RequestParam("dob") String dob)
	{
		System.out.println(id);
		Employee e=new Employee(id,name,loc,email,dob);
		es.update(e);
		List<Employee> l=es.getEmployees();
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",user);
		mv.addObject("list",l);
		mv.setViewName("display");
		return mv;
	}
	
	@PostMapping("/Upload")
	public ModelAndView upload(@RequestParam("user") String user,@RequestParam("id") int id,
			@RequestParam("Name") String name,@RequestParam("Loc") String loc,@RequestParam("email") String email,
			@RequestParam("dob") String dob)
	{
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee(id,name,loc,email,dob);
		es.upload(e);
		List<Employee> l=es.getEmployees();
		mv.addObject("user",user);
		mv.addObject("list",l);
		mv.setViewName("display");
		return mv;
	}
	@GetMapping("/download")
	public void download(HttpServletResponse response) throws IOException
	{
		response.setContentType("text/csv");
		String filename="Employees.csv";
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=" + filename;
		
		response.setHeader(headerKey,headerValue);
		
		List<Employee> l=es.getEmployees();
		es.download(response.getWriter(),l);
		
	}
}
