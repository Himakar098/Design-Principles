package com.designpattern.implementation;

import com.designpattern.interfaces.Movable;

public class BugattiVeyron implements Movable {

	@Override
	public double getSpeed() {
		return 268;
	}

	@Override
	public double getPrice() {
		return 2500;
	}

}
