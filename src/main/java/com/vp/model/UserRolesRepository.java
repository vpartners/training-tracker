package com.vp.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRolesRepository extends MongoRepository<UserRoles, String> {

	public List<UserRoles> findByUserId(String userId);
	public List<UserRoles> findByRoleId(String roleId);
}
