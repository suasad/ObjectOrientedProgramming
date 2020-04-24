package com;


public abstract class Spot {
	int floor;
	int number;
	Size size;
	Status status;
	Vehicle vehicle;
	public int getFloor() {
		return floor;
	}
	public int getNumber() {
		return number;
	}
	public Size getSize() {
		return size;
	}
	boolean parkVehicle(Vehicle vehicle) {
		if(vehicle.getSize() != this.size) {
			return false;
		}
		this.vehicle = vehicle;
		return true;
	}
	abstract int getCost(Ticket ticket);
}
