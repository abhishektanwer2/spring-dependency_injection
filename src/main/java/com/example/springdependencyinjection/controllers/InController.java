package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InController {
    private final GreetingServices greetingServices;

    public InController(@Qualifier("inService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String sayHelloInLanguage(){
        return greetingServices.sayHello();

    }
}
