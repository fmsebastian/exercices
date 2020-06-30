package com.fsebastian.sanitas.calculatorservice.config;

import io.corp.calculator.TracerAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TracerConfig {

  @Bean
  public TracerAPI tracerAPI() {
    // TODO: ask for tracer-1.0.0.jar fix to be able to use TracerImpl class
    return new TracerAPI() {
      @Override
      public <T> void trace(T result) {
        System.out.println( "result :: " + result.toString() );
      }
    };
  }

}