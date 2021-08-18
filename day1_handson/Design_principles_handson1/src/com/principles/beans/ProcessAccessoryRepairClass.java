package com.principles.beans;

import com.principles.interfaces.OrderRepair;

public class ProcessAccessoryRepairClass implements OrderRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println("repair accepted  : "+ accessoryType);
	}

	@Override
	public void ProcessOrder(String modelName) {
		
		System.out.println("repair accepted  : "+ modelName);
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println("repair accepted  : "+ modelName);		
	}


}
