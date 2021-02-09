package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedDependencyInjection {

    private final GreetingServices greetingServices;

    public ConstructorBasedDependencyInjection(@Qualifier("constructerBasedServiceImp") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayGreeting(){
        return greetingServices.sayHello();
    }
}
