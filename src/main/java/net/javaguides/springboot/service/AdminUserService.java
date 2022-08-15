package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.RoleRepository;
import net.javaguides.springboot.repository.UserRepository;

@Service
public class AdminUserService {
	
	@Autowired 
	private UserRepository repo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
    @Autowired 
    private RoleRepository roleRepo;
    
    
	
	public AdminUserService() {
		super();
	}
	

	public AdminUserService(UserRepository repo, BCryptPasswordEncoder passwordEncoder, RoleRepository roleRepo) {
		super();
		this.repo = repo;
		this.passwordEncoder = passwordEncoder;
		this.roleRepo = roleRepo;
	}


	
	  public void saveUserWithDefaultRole(User user) {
	  user.setPassword(passwordEncoder.encode(user.getPassword()));
	  
	  Role roleuser=roleRepo.findByName("User"); 
	  user.addRole(roleuser);
	  repo.save(user); }
	 
	
	public List<User> listAll()
	{
		//System.out.println(repo.findAll());
		return repo.findAll();
		
	}
	public User get (Long id)
	{
		return repo.findById(id).get();
		
	}
	public List<Role> getRoles()
	{
		return roleRepo.findAll();
	}
	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
			
		repo.save(user);
	}
}
