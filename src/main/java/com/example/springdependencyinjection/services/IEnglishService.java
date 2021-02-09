package com.example.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("inService")
public class IEnglishService implements GreetingServices{
    @Override
    public String sayHello() {
        return "Hello in English";
    }
}
