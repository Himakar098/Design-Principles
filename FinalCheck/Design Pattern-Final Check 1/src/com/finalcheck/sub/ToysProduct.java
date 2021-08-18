package com.finalcheck.sub;

import com.finalcheck.enums.Channel;
import com.finalcheck.enums.ProductType;

public class ToysProduct extends Order {

	public ToysProduct(Channel channel) {
		super(channel, ProductType.TOY);
		processOrder();
	}

	@Override
	void processOrder() {
		System.out.println("Processing toys order");
	}

}
