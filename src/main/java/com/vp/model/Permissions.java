package com.vp.model;

import org.springframework.data.annotation.Id;


public class Permissions {

    @Id
    public String id;

    public String roleId;
    public String permission;

    public Permissions() {}

    public Permissions(String id, String roleId, String permission) {
        this.id = id;
    	this.roleId = roleId;
        this.permission = permission;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, roleId='%s', permission='%s']",
                id, roleId, permission);
    }

}

