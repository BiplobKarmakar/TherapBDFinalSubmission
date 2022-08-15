package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	/*
	 * @RequestMapping("/user/dashboard") public ModelAndView userDashboard() {
	 * return new ModelAndView("user/dashboard"); }
	 * 
	 * @RequestMapping("/admin/dashboard") public ModelAndView admindashboard() {
	 * return new ModelAndView("admin/dashboard"); }
	 * 
	 * @RequestMapping("/doctors/dashboard") public ModelAndView doctorsdashboard()
	 * { return new ModelAndView("/doctors/dashboard"); }
	 */
}
