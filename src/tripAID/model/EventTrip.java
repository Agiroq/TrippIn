package tripAID.model;

import java.util.Date;

public class EventTrip {
	private String name;
	private String description;
	private float amount;
	private Date starts;
	private Date ends;
	

	public EventTrip() {
		super();
	}


	public EventTrip(String name, String description, Date starts, Date ends) {
		super();
		this.name = name;
		this.description = description;
		this.starts = starts;
		this.ends = ends;
	}


	
	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getStarts() {
		return starts;
	}


	public void setStarts(Date starts) {
		this.starts = starts;
	}


	public Date getEnds() {
		return ends;
	}


	public void setEnds(Date ends) {
		this.ends = ends;
	}
	
	
	
}
