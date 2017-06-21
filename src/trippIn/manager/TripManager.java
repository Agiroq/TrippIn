package trippIn.manager;

import trippIn.model.Bitacora;

public class TripManager {
	
	private static Bitacora home = null;

	public void createNewTrip(String title){
		
	}
	public Bitacora createHome(){
		if(this.home == null){
			this.home = new Bitacora();
		}
		return this.home;
	}
	
	public static void main(String[] args) {
		 home = new Bitacora();
	}
	
}
