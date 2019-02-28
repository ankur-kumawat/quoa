package com.demo.quoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.repos.UserRepository;
import com.demo.quoa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public User getUser(String uname) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return repo.findById(uname).orElseThrow(()->new UserNotFoundException(""));
	}

}
