package com.codingdojo.firstspring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping 
public class DateController {
	@RequestMapping("/date")
		public String date(Model model) {
			String datePattern = "EEEEEE, dd MMMMM, yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
			String date = dateFormat.format(new Date());
			model.addAttribute("date", date);
			return "date.jsp";
	}	
	
}
