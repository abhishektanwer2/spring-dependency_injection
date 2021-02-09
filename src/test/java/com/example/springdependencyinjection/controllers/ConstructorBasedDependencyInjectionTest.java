package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedDependencyInjectionTest {
ConstructorBasedDependencyInjection controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorBasedDependencyInjection(new GreetingServicesImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}
