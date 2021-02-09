package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyBasedDependencyInjectionTest {
public PropertyBasedDependencyInjection controller;
    @BeforeEach
    void setUp() {
    controller=new PropertyBasedDependencyInjection();
    controller.greetingServices=new GreetingServicesImpl();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}
