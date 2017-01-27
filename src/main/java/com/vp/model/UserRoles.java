package com.vp.model;

import org.springframework.data.annotation.Id;


public class UserRoles {

    @Id
    public String id;

    public String roleId;
    public String userId;
    
    public UserRoles() {}

    public UserRoles(String id, String userId, String roleId) {
        this.id = id;
        this.userId = userId;
    	this.roleId = roleId;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, userId='%s', roleId='%s']",
                id, userId, roleId);
    }

}

