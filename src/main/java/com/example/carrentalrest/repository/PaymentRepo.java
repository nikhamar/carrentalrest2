package com.example.carrentalrest.repository;

import com.example.carrentalrest.model.PaymentInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<PaymentInfo, String> {
}
