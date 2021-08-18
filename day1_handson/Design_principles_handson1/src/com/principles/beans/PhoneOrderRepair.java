package com.principles.beans;

import com.principles.interfaces.ProcessOrder;

public class PhoneOrderRepair implements ProcessOrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println("order accepted  : "+ modelName);
	}

}
