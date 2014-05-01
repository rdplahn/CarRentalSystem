public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014); // this creates the vehicle (v)

		v.printDetails(); //print the details for vehicle (v). At this point, there should be no kilometers
		
		v.PerDayRental(175, 5); // rent the vehicle for 175kms across 5 days
		v.printDetails();// there should now be 175kms, $500 profit, and no service recorded.
		
		v.PerKmRental(40); // attempt to rent for 40km. This should fail, as the service limit has been exceeded.
		
		v.serviceVehicle();// service the vehicle
		
		v.PerKmRental(40); // attempt to rent the vehicle for 40km.
		v.printDetails(); // print the details for the vehicle. There should be: 215kms, $540 profit, last serviced at 175kms.

	}

}
