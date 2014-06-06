package org.navee.springboot.sample.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.navee.springboot.sample.model.Department;
import org.navee.springboot.sample.model.User;
import org.navee.springboot.sample.service.DepartmentService;
import org.navee.springboot.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DepartmentService departmentService;  
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(@RequestParam(required=false,defaultValue="2")int size,@RequestParam(required=false,defaultValue="0")int page,Map<String, Object> model){
		PageRequest pageable = new PageRequest(page, size);
		Page<User> users = userService.findAll(pageable);
		model.put("users", users);
		return "userlist";
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public String user(@PathVariable("id")Long id,Map<String, Object> model){
		User user = userService.findById(id);
		model.put("user",user);
		return "user";
	}
	
	@RequestMapping(value="update/{id}",method=RequestMethod.GET)
	public String toUpdate(@PathVariable("id")Long id,Model model){
		User user = userService.findById(id);
		List<Department> depts = departmentService.findAll(null).getContent();
		model.addAttribute("user", user);
		model.addAttribute("depts", depts);
		return "edituser";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("user")User user){
		userService.save(user);
		return "redirect:/user";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(Model model){
		List<Department> depts = departmentService.findAll(null).getContent();
		model.addAttribute("depts", depts);
		return "edituser";
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable("id")Long id){
		userService.deleteById(id);
		return "redirect:/user";
	}
}
