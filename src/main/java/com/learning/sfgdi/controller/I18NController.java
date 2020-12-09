package com.learning.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.learning.sfgdi.services.GreetingService;

@Controller
public class I18NController {
  @Autowired
  @Qualifier("i18NService")
  private GreetingService greetingService;

  public String getGreeting(){
    return greetingService.sayGreeting();
  }
}
