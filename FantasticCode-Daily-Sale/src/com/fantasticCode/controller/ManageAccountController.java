package com.fantasticCode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fantasticCode.entities.Account;
import com.fantasticCode.service.AccountService;

@Controller
public class ManageAccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("account/list")
	public ModelAndView vertodos() throws Exception {
		ModelAndView mav = new ModelAndView();
		int pagina = 0;
		List<Account> accounts = null;
		accounts = accountService.findAll(pagina);
		System.out.println("El tama�� es:" + accounts.size());
		mav.addObject("accounts", accounts);
		mav.addObject("actual", Math.min((pagina + 1) * 10, accountService.countAll()));
		mav.addObject("total", accountService.countAll());
		mav.addObject("pagina", pagina + 1);
		mav.setViewName("admin/account/view_all");
		return mav;
	}
}
