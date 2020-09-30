package org.rahul.practice;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle drawn");
		
	}

}
