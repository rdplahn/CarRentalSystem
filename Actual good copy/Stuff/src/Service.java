
public class Service {
	private static final int	SERVICE_KILOMETER_LIMIT	= 100;
	private double kmSinceService;
	
	// AK service constructor, only attribute is "how overdue/ how far till overdue" it is at any given time
	public Service()
	{
		kmSinceService = 0;
	}
	
	//AK compares aggregate kms travelled since last service against the given limit 
	
	public boolean dueForService()
	{
		if(kmSinceService >= SERVICE_KILOMETER_LIMIT)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//AK km travelled is added on here. 
	public void addKilometers(double kilometers)
	{
		kmSinceService = kmSinceService + kilometers;
	}
	
	
	//AK resets km since service to zero 
	public void serviceVehicle()
	{
		kmSinceService = 0;
		System.out.println("Vehicle serviced.");
		System.out.println("\n\n");
	}

}
