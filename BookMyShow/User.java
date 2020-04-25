
public class User extends Account{
	Profile profile;
	Booking createBooking() {
		return null;
	}
	boolean cancelBooking() {
		return true;
	}
	boolean addPaymentMethod(Payment pay) {
		return true;
	}
	
}
