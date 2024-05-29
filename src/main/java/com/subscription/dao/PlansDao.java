package com.subscription.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subscription.entity.Plans;

@Repository
public interface PlansDao extends CrudRepository<Plans, Integer> {
   
}
