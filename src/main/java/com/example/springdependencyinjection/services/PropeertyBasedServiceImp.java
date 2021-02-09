package com.example.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropeertyBasedServiceImp implements GreetingServices{
    @Override
    public String sayHello() {
        return "hello PropertyBased";
    }
}
