
public class PerKmRental {

	
	
	private static final double	PER_KM_RENTAL_COST	= 1;
	private double kilometers;
	
	//constructor to set the number of kilometers for this rental to 0
	public PerKmRental()
	{
		this.kilometers = 0;
	}
	
	public void newRental(double kms)
	{
		this.kilometers = kms;
	}
	
	public double getProfit()
	{
		return (kilometers * PER_KM_RENTAL_COST);
	}
}
