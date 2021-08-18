package com.check.client;

import com.check.abstractclasses.CarFactory;
import com.check.enums.CarType;
import com.check.enums.Location;

public class CarClient {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.USA));
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}
}
