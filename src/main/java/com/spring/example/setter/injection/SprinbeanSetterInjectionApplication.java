package com.spring.example.setter.injection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @ashishw90
 *
 */
@SpringBootApplication
public class SprinbeanSetterInjectionApplication {
	@Autowired
	  private Student stud;
	  @Autowired
	  private Department dept;
	  
	  @PostConstruct
	  public void postConstruct() {
		  stud.showDeptName();
		  dept.getStudentName();
	  }

	public static void main(String[] args) {
		SpringApplication.run(SprinbeanSetterInjectionApplication.class, args);
	}
	
}
