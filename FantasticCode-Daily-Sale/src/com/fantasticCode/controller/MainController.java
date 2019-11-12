package com.fantasticCode.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fantasticCode.entities.Account;
import com.fantasticCode.entities.Offer;
import com.fantasticCode.service.AccountService;
import com.fantasticCode.service.OfferService;

@Controller
public class MainController {

	@Autowired
	private OfferService offerService;

	static Logger log = Logger.getLogger(MainController.class.getName());

	@Autowired
	private AccountService accountServ;

	@RequestMapping(value = "/")
	public ModelAndView initMain(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/login");

		// Revisa si ya hay un usuario activo.
		if (session.getAttribute("user") != null && session.getAttribute("role") != null
				&& session.getAttribute("account_id") != null) {

			if ((Integer) session.getAttribute("role") == 1) {
				mav.setViewName("redirect:/admin/view_offers");
			} else {
				mav.setViewName("redirect:/show_offers");
			}
		} else {
			mav.setViewName("user/login");

		}

		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password, HttpServletRequest request, HttpServletResponse response,
			final RedirectAttributes redirectAttributes) {
		System.out.println(username);
		System.out.println(password);
		ModelAndView mav = new ModelAndView();
		Account account = null;
		if (accountServ.findOneUser(username, password)) {
			account = accountServ.findOneUserByUsernamePassword(username, password);

			if (account != null) {
				account.setOnlinestatus(1);
				accountServ.save(account);

				HttpSession session = request.getSession();
				session.setAttribute("user", account.getUsername());
				session.setAttribute("account_id", account.getIdaccount());
				session.setAttribute("role", account.getRole().getIdrole());
				// setting session to expiry in 30 mins
				session.setMaxInactiveInterval(30 * 60);

				System.out.println(session.getAttribute("user"));
				System.out.println(session.getAttribute("account_id"));
				System.out.println(session.getAttribute("role"));

				if (account.getRole().getIdrole() == 1) {
					mav.setViewName("redirect:/admin/view_offers");
				} else {
					mav.setViewName("redirect:/show_offers");
				}

			} else {
				redirectAttributes.addFlashAttribute("error", 0);

				mav.setViewName("redirect:/");
			}
		} else {
			redirectAttributes.addFlashAttribute("error", 0);

			mav.setViewName("redirect:/");
		}

		return mav;
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session, HttpServletRequest request) {
		session.invalidate();
		return new ModelAndView("redirect:/");
	}


}
