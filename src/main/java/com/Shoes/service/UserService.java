package com.Shoes.service;

import java.util.List;

import com.Shoes.entity.User;

public interface UserService {
	
	List<User> getAllUser();
	User UpdatePass(User user);
	User AddUser(User user);

}
