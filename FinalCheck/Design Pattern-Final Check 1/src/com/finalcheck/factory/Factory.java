package com.finalcheck.factory;

import com.finalcheck.enums.Channel;
import com.finalcheck.enums.ProductType;
import com.finalcheck.sub.Order;

public class Factory {

	public static Order order(ProductType productType, Channel channel) {
		switch (channel) {
		case ECOMMERCE:
			return new ECommerceFactory().createOrder(productType);
		case TELECALLER:
			return new TeleCallerFactory().createOrder(productType);
		}
		return null;
	}

}
