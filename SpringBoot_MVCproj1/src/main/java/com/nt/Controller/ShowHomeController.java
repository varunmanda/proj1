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
	 
	
	@RequestMapping("/months")
	public String months(Map<String, Object> map) {
		map.put("attr2", "l2");
		map.put("sysmon",YearMonth.now());
		return null;//if you return null @RequestMapping("/months")name and .jsp name should be same 
		
	}
	
	@RequestMapping("/Date")
	public void Date(Model model) {
		model.addAttribute("attr3", "l3");
		model.addAttribute("sysmonth",YearMonth.now());
		
	}
	

}
