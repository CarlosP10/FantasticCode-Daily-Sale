package com.fantasticCode.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Offer;
import com.fantasticCode.entities.Offer_type;
import com.fantasticCode.service.OfferService;
import com.fantasticCode.service.Offer_type_Service;

@Controller
public class CreateOffersController {

	@Autowired
	private OfferService offerService;

	@Autowired
	private Offer_type_Service offer_type_Service;

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
	@RequestMapping(value = "/new_offer")
	public ModelAndView GenerateNewOfferView() {
		ModelAndView mav = new ModelAndView();
		List<Offer_type> offer_type_list = null;
		try {
			if (offer_type_Service.findAll() != null) {
				offer_type_list = offer_type_Service.findAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		mav.addObject("offer_type_list", offer_type_list);
		mav.setViewName("public/new_offer");
		return mav;
	}

	@RequestMapping(value = "/save_new_offer", method = RequestMethod.POST)
	public ModelAndView SaveOfferRedirection(@RequestParam String offername,
			@RequestParam String description, @RequestParam String urlposter,
			@RequestParam int availability,
			@RequestParam String startdate,
			@RequestParam String enddate,
			@RequestParam String offer_code,
			@RequestParam float price_range,
			@RequestParam int offer_state,
			@RequestParam int type) {
		
		
		ModelAndView mav = new ModelAndView();
		Offer offer=new Offer();
		offer.setOffername(offername);
		offer.setDescription(description);
		offer.setUrlposter(urlposter);
		offer.setAvailability(availability);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start_d = null;
		Date end_d = null;
		Date now=null;
		String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		try {
			start_d = sdf.parse(startdate);
			end_d = sdf.parse(enddate);
			now=sdf.parse(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		offer.setStartdate(start_d);
		offer.setEnddate(end_d);
		offer.setDuration(end_d.getTime()-start_d.getTime()+"");
		offer.setOffer_code(offer_code);
		offer.setOffer_state(offer_state);
		offer.setPrice_range(price_range);
		offer.setCreation_date_hour(now);
		//offer.setDuration(enddate.getTime()-startdate.getTime()+"");
		offer.setType(offer_type_Service.findOne(type));
		offerService.save(offer);
		mav.setViewName("redirect:/show_offers");
		return mav;
	}

}
