package com.nagarro.springboot.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springboot.main.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>
{

}
