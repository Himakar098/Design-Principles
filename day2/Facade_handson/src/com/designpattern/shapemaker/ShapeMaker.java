package com.designpattern.shapemaker;

import com.designpattern.beans.Circle;
import com.designpattern.beans.Rectangle;
import com.designpattern.beans.Square;
import com.designpattern.interfaces.Shape;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
