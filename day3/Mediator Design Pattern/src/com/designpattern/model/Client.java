package com.designpattern.model;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		BasicUser bu = new BasicUser("Himakar", chatMediator);
		PremiumUser pu = new PremiumUser("Pavan", chatMediator);
		PremiumUser pu2 = new PremiumUser("Abcd", chatMediator);
		// chatMediator.AddUser(bu);
		chatMediator.AddUser(pu);
		chatMediator.AddUser(pu2);
		String name = bu.getName();
		bu.SendMessage(name, "Hi All");
	}
}
