package com.designpattern.Abstractfactory;

import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;

public interface Factory {

	Headlight makeHeadlight();
	Tire makeTire();
}
