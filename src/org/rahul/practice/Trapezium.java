package org.rahul.practice;

import org.springframework.stereotype.Component;

@Component
public class Trapezium implements Shape {

	@Override
	public void draw() {
		System.out.println("Trapezium drawn");
		
	}

}
