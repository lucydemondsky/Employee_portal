package com.xl.demo;

/**
*@author xl
*@version  1.0
**/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
/**
 * Declare the transaction manager.
 */
public class Application extends SpringBootServletInitializer {
	
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
