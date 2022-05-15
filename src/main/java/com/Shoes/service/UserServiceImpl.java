package com.Shoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Shoes.entity.User;
import com.Shoes.repo.ProductDetailsRepo;
import com.Shoes.repo.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User UpdatePass(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User AddUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	
	
	
	
	
}
