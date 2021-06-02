/**
 * 
 */
package com.spring.example.setter.injection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ashishw90
 *
 */
@Component
public class Student {
	private Department dept;


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public void showDeptName() {

		System.out.println("Student is Alex: " + dept);
	}

}
