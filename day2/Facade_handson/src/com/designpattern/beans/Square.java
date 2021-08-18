package com.designpattern.beans;

import com.designpattern.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}
