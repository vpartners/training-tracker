package com.vp.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;


public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6529839686203506257L;

	@Id
    public String id;

    public String firstName;
    public String lastName;
    public String userName;
    public String email;
    public List<String> roles;
    public String password;

    public User() {}

    public User(String id, String firstName, String lastName, String userName, String email, List<String> roles, String password) {
        this.id = id;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.roles = roles;
        this.password = password;
    }
    
    public User(String firstName, String lastName, String userName, String email, List<String> roles, String password) {
    	this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.roles = roles;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, firstName='%s', lastName='%s', userName='%s', email='%s', roles='%s']",
                id, firstName, lastName, userName, email, roles);
    }

}

