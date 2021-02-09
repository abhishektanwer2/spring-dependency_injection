package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedDependencyInjectionTest {
SetterBasedDependencyInjection controller;
    @BeforeEach
    void setUp() {
        controller=new SetterBasedDependencyInjection();
        controller.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}
