package com.fantasticCode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Offer;
import com.fantasticCode.service.OfferService;


@Controller
public class OpenOffersController {
	@Autowired
	OfferService offerservice;
	
	@RequestMapping(value = "/show_offers")
	public ModelAndView GeneralOffers() {
		ModelAndView mav = new ModelAndView();
		List<Offer> ofertas = null;
		try {
			if (offerservice.findAll() != null) {
				ofertas = offerservice.findAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("ofertas", ofertas);
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
