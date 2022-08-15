/**
 * 
 */
package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.CustomUserdetail.CustomUserDetails;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

/**
 * @author User
 *
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("UserName "+ username);
		User user =repo.findByEmail(username);
		if (user==null) {
			throw new UsernameNotFoundException("User  not found ");
		}
		
		return new CustomUserDetails(user);
	}

}
