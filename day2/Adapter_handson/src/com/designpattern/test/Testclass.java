package com.designpattern.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.designpattern.implementation.BugattiVeyron;
import com.designpattern.implementation.MovableAdapterImpl;
import com.designpattern.interfaces.Movable;
import com.designpattern.interfaces.MovableAdapter;

public class Testclass {
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

	@Test
	public void convertUSDToEuro() {
		Movable movable = new BugattiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(movable);
		assertTrue(movableAdapter.getPrice()== (2500 * 0.85));
	}

}
