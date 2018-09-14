package com.example.carrentalrest.service;

import com.example.carrentalrest.model.PaymentInfo;
import com.example.carrentalrest.model.Registration;
import com.example.carrentalrest.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class PaymentService {
    @Autowired
    PaymentRepo paymentRepo;
    JdbcTemplate jdbcTemplate;

    public PaymentService(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void createPayment(PaymentInfo paymentInfo){
      PaymentInfo paymentInfo1=new PaymentInfo();
      paymentInfo1.setCardName(paymentInfo.getCardName());
      paymentInfo1.setCardNum(paymentInfo.getCardNum());
      paymentInfo1.setCardMonth(paymentInfo.getCardMonth());
      paymentInfo1.setCardYear(paymentInfo.getCardYear());
      paymentInfo1.setCvv(paymentInfo.getCvv());
      paymentInfo1.setUserName(paymentInfo.getUserName());


        paymentRepo.save(paymentInfo1);

    }
    public List<PaymentInfo> getPaymentinfo(PaymentInfo paymentInfo){
        List<PaymentInfo> users= new ArrayList<>();
        paymentRepo.findAll().forEach(new Consumer<PaymentInfo>() {
            @Override
            public void accept(PaymentInfo paymentInfo) {
                users.add(paymentInfo);
            }
        });
        return users;
    }
}
