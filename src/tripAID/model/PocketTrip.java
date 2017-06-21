package tripAID.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class PocketTrip {
	private float currAmount;
	private float initialAmount;
	private Map<Tripper, PocketTransaction> transactions = new LinkedHashMap<Tripper, PocketTransaction>();

	public void addTransaction(Tripper t, PocketTransaction trans){
		transactions.add(t, trans);
		actualizeAmount();
	}
	private void actualizeAmount(){
		float total=0;
		for (int i = 0; i < transactions.size(); i++) {
			currAmount += transactions.
		}
		for (PocketTransaction key : transactions.) {
			
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
	public List<PocketTransaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<PocketTransaction> transactions) {
		this.transactions = transactions;
	}
	
}
