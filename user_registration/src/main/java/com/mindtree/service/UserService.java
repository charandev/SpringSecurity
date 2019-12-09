package com.mindtree.service;

import javax.validation.Valid;

import com.mindtree.entity.User;

public interface UserService {

	User findUserByEmail(String name);

	void saveUser(@Valid User user);

}
