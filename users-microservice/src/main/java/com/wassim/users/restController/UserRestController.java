package com.wassim.users.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wassim.users.entities.User;
import com.wassim.users.repos.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
@Autowired
UserRepository userRep;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<User> getAllUsers() {
return userRep.findAll();
}
}