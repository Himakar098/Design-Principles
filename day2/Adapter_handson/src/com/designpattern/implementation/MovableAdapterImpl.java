package com.designpattern.implementation;

import com.designpattern.interfaces.Movable;
import com.designpattern.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable bugattiVeyron) {
		this.luxuryCars=bugattiVeyron;
	}

	// standard constructors
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCars.getPrice());
	}

	private double convertUSDtoEuro(double price) {
		return price * 0.85;
	}
}