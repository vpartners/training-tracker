package com.vp.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.vp.model.User;

public class SecUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6510017195606615509L;
	
	private User user;

    public SecUserDetails(User user) {
        this.setUser(user);
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return user.password;
	}

	@Override
	public String getUsername() {
		return user.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
