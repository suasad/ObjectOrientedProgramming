package com;

import java.sql.Time;

public class Ticket {
	String ticketNumber;
	String barCodeNumber;
	Time startTime;
	Time endTime;
	Vehicle vehicle;
	PaymentStatus paymentStatus;
	Spot spot;
	boolean pay(PaymentMethod method) {
		int cost = spot.getCost(this);
		return method.pay(cost);
	}
}