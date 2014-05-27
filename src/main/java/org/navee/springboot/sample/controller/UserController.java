package org.navee.springboot.sample.controller;

import java.util.Map;

import org.navee.springboot.sample.model.User;
import org.navee.springboot.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping
	public String list(Map<String, Object> model){
		Page<User> users = userService.findAll(null);
		model.put("users", users);
		//users.getNumber()
		return "user";
	}
}
