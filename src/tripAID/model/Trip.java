package tripAID.model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
	private String name;
	private String location;
	private String description;
	private PocketTrip pocket;
	private Guide guide;
	private List<EventTrip> bitacora;
	
	//constructors
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trip(String title) {
		super();
		this.name = title;
		// TODO Auto-generated constructor stub
	}
	
	public Trip(String name, String location, PocketTrip pocket) {
		super();
		this.name = name;
		this.location = location;
		this.pocket = pocket;
		this.bitacora = new ArrayList<EventTrip>(1);
	}
	
	//metods
	
	@Override
	public String toString() {
		String str = "****************\n" +
					 "**    TRIP    **\n" +
					 "****************\n" +
					 this.name +"\n(" 	  +
					 this.location+")\nMoney:" +
					 (String) Float.toString(this.pocket.getCurrAmount());
		System.out.println(str);
		return str;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public PocketTrip getPocket() {
		return pocket;
	}
	public void setPocket(PocketTrip pocket) {
		this.pocket = pocket;
	}
	public List<EventTrip> getBitacora() {
		return bitacora;
	}
	public void setBitacora(List<EventTrip> bitacora) {
		this.bitacora = bitacora;
	}
	
	
	
}
