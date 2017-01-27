package com.vp.model;

import org.springframework.data.annotation.Id;


public class Role {

    @Id
    public String id;

    public String role;
    
    public Role() {}

    public Role(String id, String role) {
        this.id = id;
    	this.role = role;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, role='%s']",
                id, role);
    }

}

