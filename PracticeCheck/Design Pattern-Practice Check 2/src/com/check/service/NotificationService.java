package com.check.service;

import java.util.ArrayList;
import java.util.List;

import com.check.interfaces.INotificationObserver;
import com.check.interfaces.INotificationService;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observers = new ArrayList<INotificationObserver>();

	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Observers are:");
		for (INotificationObserver ob : observers) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("Observers are:");
		for (INotificationObserver ob : observers) {
			System.out.println(ob.getName());
		}
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver observer : observers) {
			observer.OnServerDown();
		}
	}

}
