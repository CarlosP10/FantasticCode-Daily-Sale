package com.fantasticCode.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fantasticCode.repositories.OfferRepository;
import com.fantasticCode.service.Offer_type_Service;

public class OfferTestUnit {

	@Autowired
	private OfferRepository offer_repository;

	private Offer_type_Service offerService;

	Offer test;

	@Before
	public void setUp() {
		test = new Offer(1, "offer name", "offer description", "10",
				"https://www.sciencemag.org/sites/default/files/styles/inline__450w__no_aspect/public/dogs_1280p_0.jpg?itok=4t_1_fSJ",
				1, new GregorianCalendar(2019, Calendar.NOVEMBER, 24).getTime(),
				new GregorianCalendar(2019, Calendar.NOVEMBER, 28).getTime(), "SVPROMO", 1, (float) 20.0,
				new Offer_type(1, "comida"), new Date());
	}

	@Test
	public void saveOffer() {

		test = offer_repository.save(test);

	}

	@Test
	public void findAllOffer() {

		List<Offer_type> resultList = offerService.findAll();
		assertNotNull(resultList);
		assertFalse(resultList.isEmpty());
	}

}
