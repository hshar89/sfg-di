package com.learning.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learning.sfgdi.services.ConstructorGreetingServiceImpl;

class ContructorInjectedControllerTest {

  private ContructorInjectedController controller;

  @BeforeEach
  void setUp(){
    controller = new ContructorInjectedController(new ConstructorGreetingServiceImpl());

  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}