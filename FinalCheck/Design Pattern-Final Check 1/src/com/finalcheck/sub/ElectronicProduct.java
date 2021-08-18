package com.finalcheck.sub;

import com.finalcheck.enums.Channel;
import com.finalcheck.enums.ProductType;

public class ElectronicProduct extends Order {

	public ElectronicProduct(Channel channel) {
		super(channel, ProductType.ELECTRONIC);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Processing electronic product order");
	}

}
