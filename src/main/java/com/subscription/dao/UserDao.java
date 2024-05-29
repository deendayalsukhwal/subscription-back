package com.subscription.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subscription.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
