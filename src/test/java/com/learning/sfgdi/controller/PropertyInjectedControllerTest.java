package com.learning.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learning.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;
  @BeforeEach
  void setUp(){
    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new ConstructorGreetingServiceImpl();
  }
  @Test
  void getGreeting() {
    System.out.println(propertyInjectedController.getGreeting());
  }
}