package com.check.client;

import com.check.interfaces.INotificationObserver;
import com.check.interfaces.INotificationService;
import com.check.observer.JohnObserver;
import com.check.observer.SteveObserver;
import com.check.service.NotificationService;

public class Main {

	public static void main(String[] args) {
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		INotificationService service = new NotificationService();
		service.addSubscriber(steve);
		service.addSubscriber(john);
		service.notifySubscriber();
		service.removeSubscriber(john);
		service.notifySubscriber();
	}
}
