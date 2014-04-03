package original;

import java.util.Random;

public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;
	//AK days rented added
	private int daysrented;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);

	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getdistance());
		// AK displays days rented
		System.out.println("Total days rented: " + journey.getdays());
		System.out.println("Total Services: " + journey.getTotalServices());
		System.out.println("KM to next service: " + journey.get_km_to_nextservice());
		
		if (journey.get_km_to_nextservice()<=0)
		{
			System.out.println("error: needs service");
		}
		else if(journey.get_km_to_nextservice()<=10)
		{
			System.out.println("due for a service soon");
		}
		System.out.println("\n");
	}


}
