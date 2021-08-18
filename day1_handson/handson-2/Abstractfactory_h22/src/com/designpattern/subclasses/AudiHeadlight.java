package com.designpattern.subclasses;

import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;

public class AudiHeadlight implements Headlight {
    private Tire tire;
    private String color;
    

	public AudiHeadlight(String color) {
		this.color = color;
	}

	@Override
	public void printSpecs() {
       System.out.println(this.toString());
	}

	@Override
	public void attachTire(Tire tire) {
		this.tire =tire;
	}

	@Override
	public String toString() {
		return "AudiHeadlight [tire=" + tire + ", color=" + color + "]";
	}
	
	

}
