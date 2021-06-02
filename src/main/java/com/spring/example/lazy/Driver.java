/**
 * 
 */
package com.spring.example.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ashishw90
 *
 */
@Component
public class Driver {
	@Autowired
	private ApplicationContext appContext;

	private final Car car;

	public Driver(@Lazy Car car) {
		this.car = car;
	}

	public void showCarName() {

		System.out.println("CarName is Swift: " + car);
	}
}
