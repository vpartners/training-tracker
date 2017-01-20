package com.vp.model;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String userName;
    public String role;
    public String password;

    public User() {}

    public User(String id, String firstName, String lastName, String userName, String role, String password) {
        this.id = id;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', userName='%s']",
                id, firstName, lastName, userName);
    }

}

