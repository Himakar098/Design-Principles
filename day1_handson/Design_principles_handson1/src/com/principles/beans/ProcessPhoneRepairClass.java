package com.principles.beans;

import com.principles.interfaces.ProcessPhoneRepair;

public class ProcessPhoneRepairClass implements ProcessPhoneRepair {

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println("repair accepted  : "+ modelName);
	}

}
