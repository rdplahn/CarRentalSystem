
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;
	private double			profit;

	private Journey			journey;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;
	private PerKmRental		perKmRental;
	private PerDayRental	perDayRental;
	private Service			service;

	/**
	 * Class constructor
	 */
	
		public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
		perDayRental = new PerDayRental();
		perKmRental = new PerKmRental();
		service = new Service();
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	
		//constructor for a new vehicle, setting up a Journey, perDayRental, PerKMRental and Service object for the vehicle.
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
		perDayRental = new PerDayRental();
		perKmRental = new PerKmRental();
		service= new Service();
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Vehicle: " + manufacturer + " " + model + " (" + makeYear + " model)");
		System.out.println(journey.getKilometers() + "kms travelled, raising $" + profit);
		journey.printLastServiceAt();
		System.out.println("\n\n");
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

	public void serviceVehicle()
	{
		service.serviceVehicle();
		journey.servicedAt();
	}
	
	public void PerDayRental(double kilometers, int days)
	{
		if (service.dueForService())
		{
			System.out.println("This vehicle is due for a service, and cannot be rented");
			System.out.println("\n\n");
		}
		else
		{
			perDayRental.newRental(kilometers, days);
			journey.addKilometers(kilometers);
			this.profit = this.profit + perDayRental.getProfit();
			service.addKilometers(kilometers);
		}
	}
	
	//requests to rent the vehicle. From the main function, a rental is called THROUGH the vehicle object, 
	//to ensure that the rental is related to the specific car, rather than a random rental
	public void PerKmRental(double kilometers)
	{
		// call the dueForService function to check if the vehicle is over the service KM limit
		if (service.dueForService())
			{
			//if so, do not allow the vehicle to be rented. Alert the user
			System.out.println("This vehicle is due for a service, and cannot be rented");
			System.out.println("\n\n");
			}
		else
			{
			//if not due for a service, add a new rental to the rental object. Add the kilometers to the journey.
			perKmRental.newRental(kilometers);
			journey.addKilometers(kilometers);
			//request the profit from the current rental, and add it to past profit. This total profit is a property of the VEHICLE,
			//so that it can be tracked across both PerKmRentals and PerDayRentals
			this.profit = this.profit + perKmRental.getProfit();
			service.addKilometers(kilometers);
			}
	}
}
