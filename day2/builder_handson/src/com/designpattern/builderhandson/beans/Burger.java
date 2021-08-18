package com.designpattern.builderhandson.beans;

import com.designpattern.builderhandson.interfaces.Item;
import com.designpattern.builderhandson.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}