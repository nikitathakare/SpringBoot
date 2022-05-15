package com.Shoes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Shoes.entity.User;
import com.Shoes.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {

	private UserService userSer;
	@Autowired
	public UserController(UserService userSer) {
		super();
		this.userSer = userSer;
	}
	@PostMapping("/AddUser")
	public ResponseEntity<?> AddUser(@RequestBody User user) {
		userSer.AddUser(user);

        return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUser(){
		List<User> users = userSer.getAllUser();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@PutMapping("/ChangePass")
	public ResponseEntity<?> ChangePass(@RequestBody User user) {
		userSer.UpdatePass(user);

        return new ResponseEntity<>(HttpStatus.CREATED);

	       
	}
	
	
	
}
