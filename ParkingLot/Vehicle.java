

public class Vehicle {
	String colour;
	String number;
	Size size;
	public String getColour() {
		return colour;
	}
	public String getNumber() {
		return number;
	}
	public Size getSize() {
		return size;
	}
	boolean park(Spot spot) {
		spot.parkVehicle(this);
		return false;
		
	}
}
