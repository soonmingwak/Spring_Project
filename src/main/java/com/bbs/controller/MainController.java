package com.bbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bbs.service.UsersService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Inject
	UsersService usersService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) throws Exception {
	
		
		model.addAttribute("msg","반갑습니다.");

		return "main/main";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) throws Exception {
		
		
		return "main/join";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) throws Exception {
		
		
		return "main/login";
	}
			
	@RequestMapping(value = "/idCheck", method = RequestMethod.GET)
	public String idCheck(String user_id) throws Exception {
		
		int result = usersService.idCheck(user_id);
		
		return null;
	}
}
