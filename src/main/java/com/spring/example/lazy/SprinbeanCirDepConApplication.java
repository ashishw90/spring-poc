package com.spring.example.lazy;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @ashishw90
 *
 */
@SpringBootApplication
public class SprinbeanCirDepConApplication {
	@Autowired
	  private Car car;
	  @Autowired
	  private Driver driver;
	  
	  @PostConstruct
	  public void postConstruct() {
	      car.getDriverName();
	      driver.showCarName();
	  }

	public static void main(String[] args) {
		SpringApplication.run(SprinbeanCirDepConApplication.class, args);
	}
	
}
