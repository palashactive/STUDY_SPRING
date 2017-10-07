package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartupController {
	
	@RequestMapping("/hi")   
	public ModelAndView hiWorld() {

		ModelAndView model = new ModelAndView("home");
	//	model.addObject("msg","hi world");

		return model;
	}
}
