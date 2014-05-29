package org.navee.springboot.sample.controller;

import java.util.Map;

import org.navee.springboot.sample.model.User;
import org.navee.springboot.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(@RequestParam(required=false,defaultValue="2")int size,@RequestParam(required=false,defaultValue="0")int page,Map<String, Object> model){
		PageRequest pageable = new PageRequest(page, size);
		Page<User> users = userService.findAll(pageable);
		model.put("users", users);
		return "user";
	}
}
