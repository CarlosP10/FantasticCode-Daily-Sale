package com.fantasticCode.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Offer;
import com.fantasticCode.service.OfferService;

//controladores para manipular la url

@Controller
public class MainController {
	
	@Autowired
	private OfferService offerService;
	
	static Logger log = Logger.getLogger(MainController.class.getName());

	//controlador para acceder al login
	
	@RequestMapping(value = "/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("user/login");
		return mav;
	}
	
	//controlador para acceder a las ofertas
	
  @RequestMapping(value = "/offer")
  public ModelAndView offers() {
	  ModelAndView mav = new ModelAndView();
	  List<Offer> ofertas = null;
	  try {
		if(offerService.findAll() != null) {
			ofertas = offerService.findAll();
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	  mav.addObject("ofertas", ofertas);
	  mav.setViewName("public/offers");
	  return mav;
  }
}
