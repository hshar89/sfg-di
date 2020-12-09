package com.learning.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("es")
@Service("i18NService")
public class I18NSpanishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hola Munda";
  }
}
