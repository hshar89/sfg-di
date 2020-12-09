package com.learning.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetinRepositoryImpl implements GreetingRepository{
  @Override
  public String getEnglishGreeting() {
    return "Hello - Primary Greeting service";
  }

  @Override
  public String getSpanishGreeting() {
    return "Servicio de Saludo Primario";
  }

  @Override
  public String getGermanGreeting() {
    return "Primärer Grußdienst";
  }
}
