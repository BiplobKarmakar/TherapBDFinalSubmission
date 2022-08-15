package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping(value={"/","","/login"})
	public String login() {
		return "login";
	}
	/*
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	*/
	@RequestMapping("/user/**")
	public ModelAndView userDashboard() {
		return new ModelAndView("user/dashboard");
	}
	@RequestMapping("/admin/**")
	public ModelAndView adminDashboard() {
		return new ModelAndView("admin/dashboard");
	}

	@RequestMapping("/patients/**")
	public ModelAndView patientsDashboard() {
		return new ModelAndView("patients/dashboard");
	}
	@RequestMapping("/doctors/**")
	public ModelAndView doctorsDashboard() {
		return new ModelAndView("doctors/dashboard");
	}
	
}
