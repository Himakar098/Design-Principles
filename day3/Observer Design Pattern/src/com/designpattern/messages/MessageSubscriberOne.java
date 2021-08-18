package com.designpattern.messages;

import com.designpattern.interfaces.Observer;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}
}
