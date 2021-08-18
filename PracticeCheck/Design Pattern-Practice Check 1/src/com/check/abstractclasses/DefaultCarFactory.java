package com.check.abstractclasses;

import com.check.enums.CarType;
import com.check.enums.Location;

public class DefaultCarFactory {

	public Car buildCar(CarType carType) {
		switch (carType) {
		case LUXURY:
			return new LuxuryCar(Location.DEFAULT);
		case MINI:
			return new MiniCar(Location.DEFAULT);
		case MICRO:
			return new MicroCar(Location.DEFAULT);
		}
		return null;
	}
}
