package com.designpattern.builderhandson.beans;

import com.designpattern.builderhandson.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}
