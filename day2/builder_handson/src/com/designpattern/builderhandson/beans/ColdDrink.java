package com.designpattern.builderhandson.beans;

import com.designpattern.builderhandson.interfaces.Item;
import com.designpattern.builderhandson.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
