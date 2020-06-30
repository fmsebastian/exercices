package com.fsebastian.sanitas.calculatorservice.inboundadapters;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Api(value="Hello world", description="Hello api")
public interface helloApi {

  @ApiOperation(value = "Say hello")
  @GetMapping(value = "/")
  @ResponseStatus(HttpStatus.OK)
  String sayHello();

}
