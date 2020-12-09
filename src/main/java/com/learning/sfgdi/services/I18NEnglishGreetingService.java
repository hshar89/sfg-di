package com.learning.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en","default"})
@Service("i18NService")
public class I18NEnglishGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "English Greeting madame";
  }
}
