package com.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.vp.config.SecUserDetails;
import com.vp.model.User;
import com.vp.model.UserRepository;

@Component
public class UserDetailsController implements UserDetailsService {

	@Autowired
    private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }else{
            UserDetails details = new SecUserDetails(user);
            return details;
        }
	}

}
