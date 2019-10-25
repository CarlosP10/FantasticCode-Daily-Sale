package com.fantasticCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OpenOffersController {
	@RequestMapping(value = "/show_offers")
	public ModelAndView GeneralOffers() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("public/offers");
		return mav;
	}
  
	@RequestMapping(value = "/show_offer/{id}")
	public ModelAndView OpenOffer() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("public/view_offer");
		return mav;
	}
  
}
