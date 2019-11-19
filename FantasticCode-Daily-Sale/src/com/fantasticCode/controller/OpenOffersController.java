package com.fantasticCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Offer;
import com.fantasticCode.service.OfferService;

//contolador para mostrar las ofertas
//el primer mapping es para mostrarlas en general
//el segundo mapping es para mostrarlas por id

@Controller
public class OpenOffersController {
	@Autowired
	OfferService offerservice;
	
	@RequestMapping(value = "/show_offers")
	public ModelAndView GeneralOffers() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("public/offers");
		return mav;
	}
  
	@RequestMapping(value = "/show_offer/{id}"/*, method = RequestMethod.POST*/)
	public ModelAndView OpenOffer(@PathVariable(value="id") int id) {
		ModelAndView mav = new ModelAndView();
		Offer offer=null;
		try {
			offer=offerservice.findOne(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("specific_offer", offer);
		mav.setViewName("public/view_offer");
		return mav;
	}
  
}
