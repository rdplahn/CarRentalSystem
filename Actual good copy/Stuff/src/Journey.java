
public class Journey {
	private static final int	SERVICE_KILOMETER_LIMIT	= 100;
	private double				kilometers;
	private double				lastServiceAt = 0;

	/**
	 * Class constructor
	 */
	 
	 //RP creating a new journey initialises the kilometers to 0
	public Journey() {
		this.kilometers = 0;
	}

	/**
	 * Appends the distance parameter to {@link #kilometers}
	 * @param kilometers the distance traveled 
	 */
	 
	 //RP kilometers can be added if a rental is requested, and is allowed by the vehicle's service object
	public void addKilometers(double kilometers) {
		//System.err.println(this.kilometers);
		//System.err.println(kilometers);
		this.kilometers += kilometers;
	}

	/**
	 * Calculates the total services by dividing kilometers by
	 * {@link #SERVICE_KILOMETER_LIMIT} and floors the value (Truncates the two
	 * decimal places).
	 * 
	 * @return the number of services needed per
	 *         {@link #SERVICE_KILOMETER_LIMIT}
	 */
	 
	 
	 //RP method not used -- from previous versions
	public int getTotalServices() {
		return (int) Math.floor(kilometers / SERVICE_KILOMETER_LIMIT);
	}

	/**
	 * 
	 * @return {@link #kilometers}
	 */
	 
	 //RP a simple getter for the kilometers
	public double getKilometers() {
		return kilometers;
	}
	
	
	//RP prints a message to say whether the vehicle has been serviced or not, and when the last service was.
	//RP this is called from the Vehicle object in the printDetails() method.
	//RP it is a method of the Journey object, because it requires access to properties of this object
	public void printLastServiceAt()
	{
		if(lastServiceAt == 0)
		{
			System.out.println("This vehicle has not yet been serviced.");
		}
		else
		{
			System.out.println("This vehicle was last serviced at " + lastServiceAt + "km.");
		}
		
	}
	
	//RP a method called to track the kilometers at which the last service was performed. Called by the serviceVehicle() method in the vehicle class
	public void servicedAt()
	{
		lastServiceAt = kilometers;
	}
	

}
