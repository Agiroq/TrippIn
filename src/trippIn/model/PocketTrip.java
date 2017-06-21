package trippIn.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PocketTrip {
	private float currAmount;
	private float initialAmount;
	private Map<Traveller, List<PocketTransaction>> transactions = new LinkedHashMap<Traveller, List<PocketTransaction>>();
	
	
	public void addTransaction(Traveller t, PocketTransaction trans){
		transactions.get(t).add(trans);
		actualizeAmount();
	}
	
	private void actualizeAmount(){
		float total=0;
		//iterates through user transactions
		for (Map.Entry<Traveller, List<PocketTransaction>> entry : transactions.entrySet()) {
		    //
		    List<PocketTransaction> trans = entry.getValue();
		    for (PocketTransaction pt : trans) {
				total += pt.getAmount();
			}
		}

		this.currAmount = this.initialAmount + total;
	}
	
	public float getCurrAmount() {
		return currAmount;
	}
	
	public void setCurrAmount(float currAmount) {
		this.currAmount = currAmount;
	}
	public float getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(float initialAmount) {
		this.initialAmount = initialAmount;
	}
	public Map<Traveller, List<PocketTransaction>>  getTransactions() {
		return transactions;
	}

	
}