package com.finalcheck.main;

import com.finalcheck.interfaces.INotificationObserver;

public class TeamMember2 implements INotificationObserver {

	@Override
	public void OnBooking() {
		System.out.println("Member 2 received message");
	}

}
