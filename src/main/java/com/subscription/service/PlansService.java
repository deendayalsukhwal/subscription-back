package com.subscription.service;

import com.subscription.configuration.JwtRequestFilter;
import com.subscription.dao.PlansDao;
import com.subscription.dao.UserDao;
import com.subscription.entity.Plans;
import com.subscription.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlansService {

    @Autowired
    private PlansDao plansDao;

    @Autowired
    private UserDao userDao;


    public Plans addNewPlan(Plans plans) {
        return plansDao.save(plans);
    }


    public Plans getPlanDetailsById(Integer plansId) {
        return plansDao.findById(plansId).get();
    }

    public void deletePlanDetails(Integer plansId) {
    	plansDao.deleteById(plansId);
    }
}
