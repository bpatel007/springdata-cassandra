package com.boncloud.springdata;

import java.util.List;

public interface UserService {
	
	User getUserById(String id);
	
    List<User> getAllUsers();
    
    User saveUser(User user);
    
    User updateUser(User user);
	

}
