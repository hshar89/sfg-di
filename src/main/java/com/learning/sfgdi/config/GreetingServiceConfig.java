package com.learning.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.learning.sfgdi.services.GreetingRepository;
import com.learning.sfgdi.services.GreetingService;
import com.learning.sfgdi.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
    return new GreetingServiceFactory(repository);
  }


  @Bean
  @Primary
  @Profile({"default","en"})
  GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
    return greetingServiceFactory.createGreetingService("en");
  }

  @Bean
  @Primary
  @Profile("es")
  GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
    return greetingServiceFactory.createGreetingService("es");
  }

  @Bean
  @Primary
  @Profile("de")
  GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
    return greetingServiceFactory.createGreetingService("de");
  }

}
