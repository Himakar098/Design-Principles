package com.designpattern.model;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.interfaces.IChatMediator;
import com.designpattern.interfaces.IUser;

public class ChatMediator implements IChatMediator {

	private List<IUser> users = new ArrayList<IUser>();

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String name, String msg, IUser user) {
		for (IUser u : users) {
			u.ReceiveMessage(msg);
			System.out.println("Hi " + name);
		}
	}

}
