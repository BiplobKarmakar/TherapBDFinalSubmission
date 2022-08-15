package net.javaguides.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.AdminUserService;

@Controller
public class AdminController {
	@Autowired
	private UserRepository repo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private AdminUserService service;
    
	/*
	 * @GetMapping("") public String viewHomePage() { return "index"; }
	 */
	
	/*
	 * @GetMapping ("/register") public String showSignUpform( Model model) {
	 * model.addAttribute("user", new User());
	 * 
	 * return "signup_form"; }
	 */	
	


	@PostMapping("/process_register")
	public String processRegistration(@ModelAttribute("user") User user)
	{
		//BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		//String encodedPassword=encoder.encode(user.getPassword());
		//user.setPassword(encodedPassword);
		//service.saveUserWithDefaultRole(user);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		
		return "register_success";
		
	}
	
	@GetMapping("/users")
	
	  public String viewUsersList(Model model) {
		List<User> listusers=service.listAll(); 
		//System.out.println(listusers);
		model.addAttribute("listusers", listusers);
	  return "/admin/user.html"; 
	  }
	 
	
	@GetMapping("/admin/user/edit/{id}")
	public String editUser(@PathVariable("id") Long id,Model model )
	{
		User user= service.get(id);
		List<Role> listRoles= service.getRoles();
		model.addAttribute("listRoles",listRoles);
		model.addAttribute("user",user);
		return "user_form";
	}
	@PostMapping("/user/save")
	public String saveUser(User user)
	{
		service.save(user);
		return "redirect:/admin/dashboard";
	}
	
	
}
