package com.subscription.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subscription.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
