package original;

//stores a variable fuelEconomy. can be changed, and that's it. on creating a new vehicle it sets the fuel economy here
//equal to the input in the vehicle class. at the moment it does not affect any of our outputs.
public class FuelPurchase {
	private double	fuelEconomy;

	public FuelPurchase(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}

	public double getFuelEconomy() {
		return fuelEconomy;
	}

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}
}
