package net.javaguides.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.model.Doctors;
import net.javaguides.springboot.model.Patients;
import net.javaguides.springboot.repository.DoctorsRepository;
import net.javaguides.springboot.repository.PatientsRepository;


//import com.Threapbd.Main.Entity.User;
/*public String viewHomePage()
{
	return "index";
}
@Transactional
@GetMapping ("/register")
public String showSignUpform(  Model model)
{
	model.addAttribute("user", new User());
	return "signup_form";
}
@PostMapping("/process_register")
public String processRegistration(User user)
{
	repo.save(user);
	return "register_success";
		<span>New user? <a href="/" th:href="@{/registration}">Register
								here</a></span>	
}
*/
@Controller
//@SessionAttributes({ "patients"})
public class MainControllerdp {
	@Autowired
	PatientsRepository prepo;	
	
	@Autowired
	DoctorsRepository drepo;
	
	@GetMapping("/doctor_registrationform")
	public String doctorsPage(Model model)
	{
		model.addAttribute("doctors",new Doctors());
		return "/doctors/Doctors.html";
	}
	//doctor_registration
	 @PostMapping("/doctors_register" )
	 public String saveDoctors(Model model, @ModelAttribute("doctors") Doctors doctors)
	 {
		
		// System.out.println(patients);
		 drepo.save(doctors);
		// System.out.println(patient);
		// model.addAttribute("doctors", new Doctors());
		// System.out.println(patients);
		 return "/doctors/Doctors_registration_success";
	 }
	
	@GetMapping("/patient_registrationform")
	public String  patientPage(Model model)
	{
		model.addAttribute("patient", new Patients());
		return "/patients/Patient.html";
	}

	 @PostMapping("/register" )
	 public String savePatients(Model model, @ModelAttribute("patient") Patients patient)
	 {
		
		// System.out.println(patients);
		 prepo.save(patient);
		// System.out.println(patient);
		// model.addAttribute("patients", new Patients());
		// System.out.println(patients);
		 return "/patients/Patient_registration_success";
	 }
}
