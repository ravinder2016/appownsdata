package com.embedsample.appownsdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:powerbi-configuration.properties")
public class AppownsdataApplication {
  public static void main(String[] args) {
    SpringApplication.run(AppownsdataApplication.class,
                          args);
  }

}
