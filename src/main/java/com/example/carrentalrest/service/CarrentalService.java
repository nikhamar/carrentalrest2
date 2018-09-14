package com.example.carrentalrest.service;

import com.example.carrentalrest.model.CarInfo;
import com.example.carrentalrest.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class CarrentalService {

@Autowired
CarRepository carRepository;
    public List<CarInfo> getAllcars() {

        List<CarInfo> accounts = new ArrayList<>();

        carRepository.findAll().forEach(new Consumer<CarInfo>() {
            @Override
            public void accept(CarInfo carInfo) {
                accounts.add(carInfo);
            }
        });
        return accounts;
    }
}
