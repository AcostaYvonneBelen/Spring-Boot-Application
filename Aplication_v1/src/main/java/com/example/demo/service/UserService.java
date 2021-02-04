package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public interface UserService {

	public Iterable<User> getAllUsers();
	public User createUser(User formUser) throws Exception;
	User getUserById(Long id) throws Exception;
	public User updateUser(User user) throws Exception;
	public void deleteUser(Long id) throws Exception;
		
}
