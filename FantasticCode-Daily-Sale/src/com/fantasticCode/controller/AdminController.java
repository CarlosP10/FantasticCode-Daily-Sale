package com.fantasticCode.controller;

import java.util.List;

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
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/addsale")
	public String showSale(Model m) {
		m.addAttribute("command", new Sale());
		return "addsale";
	}
	
	/*This request mapping saves object into database
	 * I'm going to mention RequestMethod POST because default request is GET
	 */
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("sale") Sale sale) {
		dao.save(sale);
		return "redirect:/viewsale"; //will redirect view sale request mapping
	}
	
	//This provides Sale Object
	@RequestMapping("/viewsale")
	public String viewsale(Model m) {
		List<Sale> list = dao.getSales();
		m.addAttribute("list", list);
		return "viewsale";
	}
	
	@RequestMapping(value = "editsale{idsale}")
	public String edit(@PathVariable int id, Model m) {
		Sale sale = dao.getSaleById(id);
		m.addAttribute("command", sale);
		return "saleedit";
	}
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("sale") Sale sale){    
        dao.update(sale);    
        return "redirect:/viewsale";    
    }    
	
	@RequestMapping(value="/deletesale/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewsale";    
    }    

}
