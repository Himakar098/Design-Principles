package com.designpattern.beans;

import com.designpattern.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
