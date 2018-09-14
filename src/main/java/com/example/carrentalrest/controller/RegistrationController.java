package com.example.carrentalrest.controller;

import com.example.carrentalrest.model.Registration;
import com.example.carrentalrest.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;
@PostMapping(value = "/users")
    public void createUsers(@RequestBody Registration registration){
        registrationService.createUser(registration);
    }
@RequestMapping(value = "/users", method = RequestMethod.GET)
public List<Registration> getAllUsers(Registration registration){
    return registrationService.getAllUsers(registration);
}
@RequestMapping(value = "/user", method = RequestMethod.GET)
public Registration getUser(@RequestBody Registration registration){
    return registrationService.getUser(registration);
}
@RequestMapping(value = "/user", method = RequestMethod.POST)
public Registration validateUser(@RequestBody Registration registration){
    return registrationService.validateUser(registration);
}
}
