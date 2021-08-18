package com.finalcheck.main;

import com.finalcheck.interfaces.INotificationObserver;

public class TeamMember1 implements INotificationObserver {

	@Override
	public void OnBooking() {
		System.out.println("Member 1 received message");
	}

}
