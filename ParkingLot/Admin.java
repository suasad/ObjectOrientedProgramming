

import java.util.List;

public class Admin extends Account{
	List<Floor> allFloors;
	boolean addFloor() {
		return true;
	}
	
	boolean addSpot(Floor floor, Spot spot) {
		return true;
	}
	

	boolean removeSpot(Floor floor, Spot spot) {
		return true;
	}
	
	boolean addGate(Floor floor, Gate gate) {
		return false;
	}
	
}
