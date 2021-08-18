package com.check.abstractclasses;

import com.check.enums.CarType;
import com.check.enums.Location;

public class IndiaCarFactory {

	public Car buildCar(CarType carType) {
		switch (carType) {
		case LUXURY:
			return new LuxuryCar(Location.INDIA);
		case MINI:
			return new MiniCar(Location.INDIA);
		case MICRO:
			return new MicroCar(Location.INDIA);
		}
		return null;
	}
}
