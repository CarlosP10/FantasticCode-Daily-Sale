package com.fantasticCode.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.dao.SaleDao;
import com.fantasticCode.domain.Sale;


@Controller
public class AdminController {
	
	//@Autowired
	SaleDao dao;
	
	@RequestMapping(value = "/index")
	public ModelAndView initMain(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		if(session.getAttribute("user") != null && session.getAttribute("role")!=null && session.getAttribute("account_id")!=null ){
			
			
			if((Integer)session.getAttribute("role")!=1) {
				mav.setViewName("redirect:/show_offers");
			}
		}else {
			mav.setViewName("redirect:/");
			
		}
		
			
		return mav;
	}
	  

}
