package com.designpattern.beans;

import com.designpattern.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
