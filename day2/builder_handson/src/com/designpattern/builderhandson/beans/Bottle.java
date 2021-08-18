package com.designpattern.builderhandson.beans;

import com.designpattern.builderhandson.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
