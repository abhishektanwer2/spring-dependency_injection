package com.example.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedServicesImp implements GreetingServices{
    @Override
    public String sayHello() {
        return "Hello SetterBased";
    }
}
