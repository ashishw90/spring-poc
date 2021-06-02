/**
 * 
 */
package com.spring.example.setter.injection;

import org.springframework.stereotype.Component;

/**
 * @ashishw90
 *
 */
@Component
public class Department {

	private Student student;


	public void setStudent(Student student) {
		this.student = student;
	}


	public void getStudentName() {

		System.out.println("student Name is : xyz " + student);
	}

}
