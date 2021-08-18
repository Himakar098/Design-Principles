package com.check.abstractclasses;

import com.check.enums.CarType;
import com.check.enums.Location;

public class USACarFactory {

	public Car buildCar(CarType carType) {
		switch (carType) {
		case LUXURY:
			return new LuxuryCar(Location.USA);
		case MINI:
			return new MiniCar(Location.USA);
		case MICRO:
			return new MicroCar(Location.USA);
		}
		return null;
	}

}
