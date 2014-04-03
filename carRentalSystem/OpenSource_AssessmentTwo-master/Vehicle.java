
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;

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
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
		System.out.println("Total Services: " + journey.getTotalServices());
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}

}
