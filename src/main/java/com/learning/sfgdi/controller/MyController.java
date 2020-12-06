package com.learning.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.sfgdi.services.GreetingService;

@Controller
public class MyController {

  @Autowired
  private GreetingService greetingService;

  public String sayHello(){
    return greetingService.sayGreeting();
  }
}
