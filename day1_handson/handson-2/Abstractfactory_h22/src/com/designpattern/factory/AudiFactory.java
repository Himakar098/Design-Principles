package com.designpattern.factory;

import com.designpattern.Abstractfactory.Factory;
import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;
import com.designpattern.subclasses.AudiHeadlight;
import com.designpattern.subclasses.AudiTire;

public class AudiFactory implements Factory {
	
	private double alloyInches;
	private String type;
	private String color;
	

	public AudiFactory(double alloyInches, String type,String color) {
		super();
		this.alloyInches = alloyInches;
		this.type = type;
		this.color = color;
	}

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight(color);
	}

	@Override
	public Tire makeTire() {
		return new AudiTire(alloyInches,type);
	}

}
