package org.cap.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("validatelogin")
	public String validateLogin(ModelMap map,@RequestParam("username")String username,@RequestParam("password")String password) {
		
		if(username.compareTo("tome")==0 && password.compareTo("tom123")==0)
		{
			map.addAttribute("username", username);
			return "success";
		}
		
		return "redirect:/";
		
		
	}
	
}
