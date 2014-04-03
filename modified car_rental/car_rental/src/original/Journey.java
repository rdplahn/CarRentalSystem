package original;

import java.util.Random;

public class Journey {
	private static final int	SERVICE_KILOMETER_LIMIT	= 100;
	private double				kilometers;
	//AK days added
	int				days;

	/**
	 * Class constructor
	 */
	public Journey() {
		this.kilometers = generate_distance();
		//AK days added
		this.days=generate_days();
	}

	/**
	 * Appends the distance parameter to {@link #kilometers}
	 * @param kilometers the distance traveled 
	 */
	// AK random distance and days generation added here, streamlined from previous method.
	
	public double generate_distance(){
		double distance=0;
		double new_dist=0;
		for (int i = 0; i < 10; i++) {
			new_dist=(new Random().nextInt(100));
			//System.out.println(new_dist+"(new)");
			distance=distance+(new_dist);
			//System.out.println(distance+"(total)");
			
		}
		//System.out.println("\n");
		return distance;
	}
	
	//generate days added with distribution range 0-10.
	public int generate_days(){
		int totaldays=0;
		int new_days=0;
		for (int i = 0; i < 10; i++) {
			new_days=(new Random().nextInt(10));
			//System.out.println(new_days+"(new)");
			totaldays=totaldays+(new_days);
			//System.out.println(totaldays+"(total)");
		}
		//System.out.println("\n\n\n");
		return totaldays;
	}
	


	/**
	 * Calculates the total services by dividing kilometers by
	 * {@link #SERVICE_KILOMETER_LIMIT} and floors the value (Truncates the two
	 * decimal places).
	 * 
	 * @return the number of services needed per
	 *         {@link #SERVICE_KILOMETER_LIMIT}
	 */
	public int getTotalServices() {
		return (int) Math.floor(kilometers / SERVICE_KILOMETER_LIMIT);
	}
	
	//Ak get kilometers to next service
	
	public double get_km_to_nextservice() {
		double km_to_go;
		
		km_to_go= (SERVICE_KILOMETER_LIMIT-(kilometers-(((int) Math.floor(kilometers / SERVICE_KILOMETER_LIMIT))*SERVICE_KILOMETER_LIMIT)));
		

		
		return km_to_go;
		
	}

	/**
	 * 
	 * @return {@link #kilometers}
	 */
	//fairly simple, does not do much, just returns a value when called.
	public double getdistance() {
		return kilometers;
	}
	
	public double getdays() {
		return days;
	}

}
