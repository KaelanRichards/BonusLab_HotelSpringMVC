package com.hotel.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.Hotel.dao.HotelRepo;

@Controller
public class HotelController {

	@Autowired
	HotelRepo hotelDao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		
		mv.addObject("city",hotelDao.findByCity());
		
		
		return mv;
		
	}

	@PostMapping("/result")
	public ModelAndView listCity(@RequestParam("city")String city) {
		ModelAndView mv = new ModelAndView("result");
		
		mv.addObject("hotelresult", hotelDao.findByCityOrderByPricePerNightAsc(city));
		mv.addObject("city",city);
		
		return mv;
	}
}
