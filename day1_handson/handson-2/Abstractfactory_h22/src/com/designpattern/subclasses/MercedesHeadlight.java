package com.designpattern.subclasses;

import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;

public class MercedesHeadlight implements Headlight {

	private Tire tire;
	private String color;

	public MercedesHeadlight(String color) {
		super();
		this.color = color;
	}

	@Override
	public void printSpecs() {
		System.out.println(this.toString());
	}

	@Override
	public void attachTire(Tire tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "MercedesHeadlight [tire=" + tire + ", color=" + color + "]";
	}

}
