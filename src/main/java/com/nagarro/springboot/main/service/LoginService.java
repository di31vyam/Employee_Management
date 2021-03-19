package com.nagarro.springboot.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.springboot.main.entity.User;
import com.nagarro.springboot.main.repository.UserRepository;

@Service
public class LoginService 
{
	@Autowired
	UserRepository user;
	
	public boolean verify(String userId,String password)
	{
		Optional<User> op=user.findById(userId);
		if(op.isPresent())
		{
			User u=op.get();
			if(u.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
