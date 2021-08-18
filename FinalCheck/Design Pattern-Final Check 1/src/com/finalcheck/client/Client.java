package com.finalcheck.client;

import com.finalcheck.enums.Channel;
import com.finalcheck.enums.ProductType;
import com.finalcheck.factory.Factory;

public class Client {

	public static void main(String[] args) {
		System.out.println(Factory.order(ProductType.ELECTRONIC, Channel.ECOMMERCE));
		System.out.println(Factory.order(ProductType.FURNITURE, Channel.ECOMMERCE));
		System.out.println(Factory.order(ProductType.TOY, Channel.TELECALLER));
	}
}
