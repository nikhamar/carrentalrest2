package com.example.carrentalrest.controller;

import com.example.carrentalrest.model.PaymentInfo;
import com.example.carrentalrest.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @PostMapping(value = "/payments")
    public void createPayment(@RequestBody PaymentInfo paymentInfo){
        paymentService.createPayment(paymentInfo);
        System.out.println(paymentInfo.cardName);
    }

    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    public List<PaymentInfo> getAllUsers(PaymentInfo paymentInfo){
        return paymentService.getPaymentinfo(paymentInfo);
    }
}
