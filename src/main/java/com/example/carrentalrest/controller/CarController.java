package com.example.carrentalrest.controller;

import com.example.carrentalrest.model.CarInfo;
import com.example.carrentalrest.service.CarrentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarrentalService carrentalService;

    @RequestMapping(value = "/cars")
    public List<CarInfo> getAllCars(){
        return carrentalService.getAllcars();

    }
}
