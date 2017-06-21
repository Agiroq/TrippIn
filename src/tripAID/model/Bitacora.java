package tripAID.model;

import java.util.ArrayList;
import java.util.List;

public class Bitacora {

	List<Trip> trips = new ArrayList<Trip>(5);
	
	

	public Bitacora() {
		super();
	}
	
	public Bitacora(List<Trip> trips) {
		super();
		this.trips = trips;
	}

	public void addTrip(Trip t){
		trips.add(t);
	}
	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}
	
	
	
}
