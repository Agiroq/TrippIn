package trippIn.manager;

import trippIn.model.Trip;
import trippIn.model.User;

public class userManager {
	private static User u = null;
	
	
	public static void main(String[] args) {
		u = new User("Albert Giró Quer", "ihipi");
		Trip trip = new Trip("New York");
		trip.setLocation("EUA");
		
		u.addTrip(trip);
		System.out.println(u.toString());
	}

}
