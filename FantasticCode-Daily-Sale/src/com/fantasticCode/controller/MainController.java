package com.fantasticCode.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	static Logger log = Logger.getLogger(MainController.class.getName());

	
	@RequestMapping(value = "/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("user/login");
		return mav;
	}

	@RequestMapping(value = "/show_offer")
	public ModelAndView OpenOffer() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("public/view_offer");
		return mav;
	}
}
