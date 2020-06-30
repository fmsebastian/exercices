package com.fsebastian.sanitas.calculatorservice.inboundadapters;

import io.corp.calculator.TracerAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class helloImpl implements helloApi {

  @Autowired
  private TracerAPI tracerApi;

  @Override
  public String sayHello() {
    String s = "Say hello with Swagger";
    tracerApi.trace(s);
    return s;
  }

}