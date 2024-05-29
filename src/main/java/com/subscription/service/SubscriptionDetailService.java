package com.subscription.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.subscription.configuration.JwtRequestFilter;
import com.subscription.dao.SubscriptionDetailDao;
import com.subscription.dao.PlansDao;
import com.subscription.dao.UserDao;
import com.subscription.entity.*;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionDetailService {

    private static final String ORDER_PLACED = "Placed";

    private static final String KEY = "rzp_test_dE1bg9rfhymOVd";
    private static final String KEY_SECRET = "pv6ujuflZsJaxoaEmlX7VQyn";
    private static final String CURRENCY = "INR";

    @Autowired
    private SubscriptionDetailDao subscriptionDetailDao;

    @Autowired
    private PlansDao productDao;

    @Autowired
    private UserDao userDao;


 
//    public List<SubscriptionDetail> getOrderDetails() {
//        String currentUser = JwtRequestFilter.CURRENT_USER;
//        User user = userDao.findById(currentUser).get();
//
//        return subscriptionDetailDao.findByUser(user);
//    }


    public TransactionDetails createTransaction(Double amount) {
        try {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("amount", (amount * 100) );
            jsonObject.put("currency", CURRENCY);

            RazorpayClient razorpayClient = new RazorpayClient(KEY, KEY_SECRET);

            Order order = razorpayClient.orders.create(jsonObject);

            TransactionDetails transactionDetails =  prepareTransactionDetails(order);
            return transactionDetails;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private TransactionDetails prepareTransactionDetails(Order order) {
        String orderId = order.get("id");
        String currency = order.get("currency");
        Integer amount = order.get("amount");

        TransactionDetails transactionDetails = new TransactionDetails(orderId, currency, amount, KEY);
        return transactionDetails;
    }
}
