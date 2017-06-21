package tripAID.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private String id;
	private List<Trip> historial;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		this.historial = new ArrayList<Trip>(1);
	}
//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Trip> getHistorial() {
		return historial;
	}

	public void setHistorial(List<Trip> historial) {
		this.historial = historial;
	}
	
	
@Override
	public String toString() {
		String str ="=============================\n" +
					"========   USER   ===========\n" +
					"=============================\n" +
					this.name ;
		for (Trip trip : historial) {
			str += trip.toString();
		}
		return str;
	}

	//Other Metods
	public void addTrip(Trip trip){
		this.historial.add(trip);
	}
	public Trip getLastTrip(){
		return this.historial.get(-1);
	}
	
	
	

}
