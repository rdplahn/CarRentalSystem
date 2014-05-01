
public class PerDayRental {
	private static final double	PER_DAY_RENTAL_COST	= 100;
	private int days;
	
	public PerDayRental()
	{
		this.days = 0;
	}
	
	public void newRental(double kilometers, int days)
	{
		this.days = days;
	}
	
	public double getProfit()
	{
		return (days * PER_DAY_RENTAL_COST);
	}
	
	
}
