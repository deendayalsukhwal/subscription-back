package com.subscription.controller;

import com.subscription.entity.Plans;
import com.subscription.service.PlansService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
public class PlansController {

    @Autowired
    private PlansService plansService;


    @GetMapping({"/getPlanDetailsById/{planId}"})
    public Plans getProductDetailsById(@PathVariable("planId") Integer planId) {
        return plansService.getPlanDetailsById(planId);
    }

    @PreAuthorize("hasRole('Admin')")
    @DeleteMapping({"/deletePlanDetails/{planId}"})
    public void deleteProductDetails(@PathVariable("planId") Integer productId) {
    	plansService.deletePlanDetails(productId);
    }

}
