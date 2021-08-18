package com.designpattern.subclasses;

import com.designpattern.interfaces.Tire;

public class AudiTire implements Tire {

	private double alloyInches;
	private String type;
	
	
	public AudiTire(double alloyInches, String type) {
		super();
		this.alloyInches = alloyInches;
		this.type = type;
	}

	@Override
	public void getType() {
		System.out.println(this.type);
	}

	@Override
	public String toString() {
		return "AudiTire [alloyInches=" + alloyInches + ", type=" + type + "]";
	}
	
	

}
