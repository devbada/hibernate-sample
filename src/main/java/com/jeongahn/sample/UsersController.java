package com.jeongahn.sample;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeongahn.sample.entity.Users;
import com.jeongahn.sample.impl.UserService;

@Controller
public class UsersController {
	@Autowired private UserService userService;
	
	@RequestMapping("/userList")
	public ModelAndView listUsers(Map<String, Object> map) {
		map.put("users", new Users());
		map.put("userList", userService.getListUsers());
		ModelAndView mv = new ModelAndView("/users/userList");
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("users") Users user, BindingResult result) {
		userService.addUser(user);
		
		return "redirect:/index";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
    public String deleteContact(@ModelAttribute("users") Users user) {
 
		userService.removeUser(user);
 
        return "redirect:/index";
    }
}
