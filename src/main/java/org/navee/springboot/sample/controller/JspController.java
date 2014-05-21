package org.navee.springboot.sample.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	@RequestMapping("/hellojsp")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		//model.put("message", this.message);
		return "welcome";
	}
}
