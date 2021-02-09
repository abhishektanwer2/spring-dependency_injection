package com.example.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("HN")
@Service("inService")
public class IHindiService implements GreetingServices{
    @Override
    public String sayHello() {
        return "Namaste in Hindi";
    }
}
