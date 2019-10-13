package com.fantasticCode.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Account;
import com.fantasticCode.service.AccountService;
import com.fantasticCode.service.UserService;



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
			mav.setViewName("admin/account/view_all");
		return mav;
	}
	
	
	@Autowired
	private UserService userService;
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("account/list")
	public ModelAndView vertodos() throws Exception{
		ModelAndView mav = new ModelAndView();
		int pagina=0;
	
		
		List<Account> accounts = null;
		
		accounts = accountService.findAll(pagina);
		System.out.println("El tamañò es:"+accounts.size());
		mav.addObject("accounts", accounts);
		mav.addObject("actual", Math.min((pagina + 1) * 10,accountService.countAll()));
		mav.addObject("total", accountService.countAll());
		mav.addObject("pagina", pagina + 1);
		mav.setViewName("admin/account/view_all");
		return mav;
	}



}
