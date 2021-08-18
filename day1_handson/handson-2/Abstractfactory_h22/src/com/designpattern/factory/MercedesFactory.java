package com.designpattern.factory;

import com.designpattern.Abstractfactory.Factory;
import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;
import com.designpattern.subclasses.AudiTire;
import com.designpattern.subclasses.MercedesHeadlight;
import com.designpattern.subclasses.MercedesTire;

public class MercedesFactory implements Factory {

	private double alloyInches;
	private String type;
	private String color;
	
	
	public MercedesFactory(double alloyInches, String type,String color) {
		super();
		this.alloyInches = alloyInches;
		this.type = type;
		this.color=color;
	}

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight(color);
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire(alloyInches,type);
	}

}
