package com.check.abstractclasses;

import com.check.enums.CarType;
import com.check.enums.Location;

class MiniCar extends Car {
	MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to Mini car");
	}
}