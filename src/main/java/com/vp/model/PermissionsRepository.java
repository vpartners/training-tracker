package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionsRepository extends MongoRepository<Permissions, String> {

    public List<Permissions> findByRoleId(String roleId);
    public List<Permissions> findByPermission(String permission);
}
