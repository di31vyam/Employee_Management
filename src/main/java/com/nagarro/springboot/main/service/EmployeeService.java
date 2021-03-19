package com.nagarro.springboot.main.service;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.springboot.main.entity.Employee;


@Service
public class EmployeeService 
{
	public List<Employee> getEmployees()
	{
		 RestTemplate template = new RestTemplate();
	     String url = "http://localhost:9095/api/employee/get";
	     MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
	     mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
	     template.getMessageConverters().add(mappingJackson2HttpMessageConverter);
	     ResponseEntity<List<Employee>> entity = template.exchange(url,HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {});
	  
	     List<Employee> empList = entity.getBody();
	     return empList;
	}
	public void update(Employee e)
	{
		 RestTemplate template = new RestTemplate();
		 HttpEntity<Employee> request = new HttpEntity<Employee>(e);
		 String url = "http://localhost:9095/api/employee/update";
	     template.put(url, request);
	}
	public void upload(Employee e)
	{
		 RestTemplate template = new RestTemplate();
		 HttpEntity<Employee> request = new HttpEntity<Employee>(e);
		 String url = "http://localhost:9095/api/employee/upload";
		 template.postForObject(url, request, Employee.class);
	}
	public void download(PrintWriter p,List<Employee> l)
	{
		p.write("Empcode,Name,Location,Email,Dob\n");
		for(Employee e: l)
		{
			p.write(e.getEmpcode()+","+e.getName()+","+e.getLoc()+","+e.getEmail()+","+e.getDob()+"\n");
		}
	}
}
