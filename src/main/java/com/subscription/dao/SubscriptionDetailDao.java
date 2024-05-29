package com.subscription.dao;

import org.springframework.data.repository.CrudRepository;

import com.subscription.entity.SubscriptionDetail;
import com.subscription.entity.User;

import java.util.List;

public interface SubscriptionDetailDao extends CrudRepository<SubscriptionDetail, Integer> {
    //public List<SubscriptionDetail> findByUser(User user);
    public  List<SubscriptionDetail> findByStatus(String status);
}
