package com.finalcheck.service;

import java.util.ArrayList;
import java.util.List;

import com.finalcheck.interfaces.INotificationObserver;
import com.finalcheck.interfaces.INotificationService;

public class NotificationService implements INotificationService {

	List<INotificationObserver> members = new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver member) {
		members.add(member);
	}

	@Override
	public void removeSubscriber(INotificationObserver member) {
		members.remove(member);
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver m : members) {
			m.OnBooking();
		}
	}

}
