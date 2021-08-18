package com.designpattern.interfaces;

import com.designpattern.messages.Message;

public interface Observer {
	public void update(Message m);
}