package learning;

import java.io.Serializable;

public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int slno;
	private String brand;
	
	public Vehicle(int slno,String brand)
	{
		this.slno=slno;
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		return "Vechile [ SerialNUmber=" + slno + "Brand : " + brand + "]";
	}


}
