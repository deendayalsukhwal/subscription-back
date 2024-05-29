package com.subscription.controller;

import com.subscription.entity.TransactionDetails;
import com.subscription.service.SubscriptionDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
public class SubscriptionDetailController {

    @Autowired
    private SubscriptionDetailService subscriptionDetailService;

    @PreAuthorize("hasRole('User')")
    @GetMapping({"/createTransaction/{amount}"})
    public TransactionDetails createTransaction(@PathVariable(name = "amount") Double amount) {
        return subscriptionDetailService.createTransaction(amount);
    }
}
