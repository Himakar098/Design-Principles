package com.finalcheck.factory;

import com.finalcheck.enums.Channel;
import com.finalcheck.enums.ProductType;
import com.finalcheck.sub.ElectronicProduct;
import com.finalcheck.sub.FurnitureProduct;
import com.finalcheck.sub.Order;
import com.finalcheck.sub.ToysProduct;

public class ECommerceFactory {

	public Order createOrder(ProductType productType) {
		switch (productType) {
		case ELECTRONIC:
			return new ElectronicProduct(Channel.ECOMMERCE);
		case FURNITURE:
			return new FurnitureProduct(Channel.ECOMMERCE);
		case TOY:
			return new ToysProduct(Channel.ECOMMERCE);
		}
		return null;
	}

}
