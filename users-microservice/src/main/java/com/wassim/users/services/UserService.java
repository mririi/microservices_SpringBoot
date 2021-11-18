package com.wassim.users.services;

import com.wassim.users.entities.Role;
import com.wassim.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}