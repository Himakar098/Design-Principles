package com.designpattern.interfaces;

import com.designpattern.messages.Message;

public interface Subject {
	public void attach(Observer o);

	public void detach(Observer o);

	public void notifyUpdate(Message m);
}