package com.Shoes.repo;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Shoes.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
