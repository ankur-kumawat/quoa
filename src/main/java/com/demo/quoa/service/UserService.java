package com.demo.quoa.service;

import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;

public interface UserService {

	User getUser(String uname) throws UserNotFoundException;

}
