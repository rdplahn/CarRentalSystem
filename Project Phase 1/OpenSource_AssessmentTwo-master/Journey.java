
public class Journey {
	private static final int	SERVICE_KILOMETER_LIMIT	= 100;
	private double				kilometers;

	/**
	 * Class constructor
	 */
	public Journey() {
		this.kilometers = 0;
	}

	/**
	 * Appends the distance parameter to {@link #kilometers}
	 * @param kilometers the distance traveled 
	 */
	public void addKilometers(double kilometers) {
		System.err.println(this.kilometers);
		System.err.println(kilometers);
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
	public int getTotalServices() {
		return (int) Math.floor(kilometers / SERVICE_KILOMETER_LIMIT);
	}

	/**
	 * 
	 * @return {@link #kilometers}
	 */
	public double getKilometers() {
		return kilometers;
	}

}
