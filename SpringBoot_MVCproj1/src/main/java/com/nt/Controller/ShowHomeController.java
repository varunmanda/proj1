package com.nt.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	
	  @RequestMapping("/process") 
	  public String process(Map<String, Object> map) {
	  System.out.println("showHomecontroller.process()::Share memory object class name"+map.getClass()); 
	  map.put("attr1", "val1"); 
	  map.put("sysyear",Year.now());
	  map.put("sysDate",LocalDate.now());
	  map.put("systym",LocalTime.now());
	  map.put("sysDT",LocalDateTime.now());
	  return "welcome";
	  
	  }
	 


}
