package com.example.carrentalrest.controller;

import com.example.carrentalrest.model.TravelInfo;
import com.example.carrentalrest.service.TravelinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TravelinfoController {

    @Autowired
    TravelinfoService travelinfoService;
    @PostMapping(value = "/travelinfo")
    public void createUsersinfo(@RequestBody TravelInfo travelInfo){
        travelinfoService.createUserinfo(travelInfo);
        System.out.println(travelInfo.dropofflocation);
    }

    @RequestMapping(value = "/travelinfo", method = RequestMethod.GET)
    public TravelInfo getUser(@RequestBody TravelInfo travelInfo){
        return travelinfoService.getUserinfo(travelInfo);
    }

}

