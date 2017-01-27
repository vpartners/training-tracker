package com.vp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.vp.controller.UserDetailsController;
 

@Configuration
@EnableWebSecurity
public class CustomUserDetailsSecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Autowired
	UserDetailsController userDetailsService ;

    @Autowired
    public void configAuthBuilder(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailsService); 
    }
 
}
