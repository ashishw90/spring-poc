/**
 * 
 */
package com.spring.example.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ashishw90
 *
 */
@Component
public class Car {

	private Driver driver;

	public Car(  Driver driver) {
		this.driver = driver;
	}

	public void getDriverName() {

		System.out.println("driven by: xyz " + driver);
	}
}
