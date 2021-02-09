package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedDependencyInjection {
    @Autowired
    private @Qualifier("setterBasedServicesImp")GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayGreeting(){
        return greetingServices.sayHello();
    }
}
