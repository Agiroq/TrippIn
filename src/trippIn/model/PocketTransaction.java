package trippIn.model;

import java.io.File;

public class PocketTransaction {
	private float amount;
	private String title;
	private String description;
	private File factura;
	
	//Constructor
	public PocketTransaction(float amount, String title, String description, File factura) {
		super();
		this.amount = amount;
		this.title = title;
		this.description = description;
		this.factura = factura;
	}
	public PocketTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Metods
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public File getFactura() {
		return factura;
	}
	public void setFactura(File factura) {
		this.factura = factura;
	}
}
