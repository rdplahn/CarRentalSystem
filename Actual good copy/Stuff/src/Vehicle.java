
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
	
	// RP default constructor
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
	 
	 //RP simply prints the details of the vehicle
	public void printDetails() {
		System.out.println("Vehicle: " + manufacturer + " " + model + " (" + makeYear + " model)");
		System.out.println(journey.getKilometers() + "kms travelled, raising $" + profit);
		journey.printLastServiceAt();//calls a method in the journey object to determine and print the last service
		System.out.println("\n\n");
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	 
	 //RP (not used -- previous version)vehicles can have kilometers added. Method is in vehicle class to ensure kilometers are added to the corresponding journey
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}

	public void serviceVehicle()
	{
		//RP calls the service method in the service object to create a service, and ensures that the journey has a record of the service as well
		service.serviceVehicle();
		journey.servicedAt();
	}
	
	//RP requests to rent the vehicle. From the main function, a rental is called THROUGH the vehicle object, 
	//RP to ensure that the rental is related to the specific car, rather than a random rental
	public void PerDayRental(double kilometers, int days)
	{
		// RP call the dueForService function to check if the vehicle is over the service KM limit
		if (service.dueForService())
		{
			//RP if so, do not allow the vehicle to be rented. Alert the user
			System.out.println("This vehicle is due for a service, and cannot be rented");
			System.out.println("\n\n");
		}
		else
		{
			//RP if not due for a service, add a new rental to the PerDayRental object. Add the kilometers to the journey.
			perDayRental.newRental(kilometers, days);
			journey.addKilometers(kilometers);
			//RP request the profit from the current PerDayRental, and add it to past profit. This total profit is a property of the VEHICLE,
			//RP so that it can be tracked across both PerKmRentals and PerDayRentals
			this.profit = this.profit + perDayRental.getProfit();
			service.addKilometers(kilometers);
		}
	}
	
	//RP requests to rent the vehicle. From the main function, a rental is called THROUGH the vehicle object, 
	//RP to ensure that the rental is related to the specific car, rather than a random rental
	public void PerKmRental(double kilometers)
	{
		// RP call the dueForService function to check if the vehicle is over the service KM limit
		if (service.dueForService())
			{
			//RP if so, do not allow the vehicle to be rented. Alert the user
			System.out.println("This vehicle is due for a service, and cannot be rented");
			System.out.println("\n\n");
			}
		else
			{
			//RP if not due for a service, add a new rental to the PerKmRental object. Add the kilometers to the journey.
			perKmRental.newRental(kilometers);
			journey.addKilometers(kilometers);
			//RP request the profit from the current PerKmRental, and add it to past profit. This total profit is a property of the VEHICLE,
			//RP so that it can be tracked across both PerKmRentals and PerDayRentals
			this.profit = this.profit + perKmRental.getProfit();
			service.addKilometers(kilometers);
			}
	}
}
