package com.boncloud.springdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(String id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		 userRepository.findAll().iterator().forEachRemaining(users::add);
		return users;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

}
