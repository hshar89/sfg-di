package com.learning.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learning.sfgdi.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp(){
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}