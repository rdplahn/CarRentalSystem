package original;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// AK demonstrates generating new vehicle with the given parameters constructor and the no parameters constructor.
		Vehicle a = new Vehicle("Ford", "T812", 2014);
		Vehicle b = new Vehicle();
		Vehicle c = new Vehicle();
		Vehicle d = new Vehicle();
		Vehicle e = new Vehicle();
		Vehicle f = new Vehicle();
		Vehicle g = new Vehicle("Honda","A34", 2013);

		// AK see vehicle for print details. it is basically 5 lines associated to the given vehicle.
		// note how we call the function, we have objName.funcName
		a.printDetails();
		b.printDetails();
		c.printDetails();
		d.printDetails();
		e.printDetails();
		f.printDetails();
		g.printDetails();
		d.printDetails();
		a.printDetails();
		
		// AK distance random number generator moved to vehicle class as deemed inefficient for the function to pass through 3 classes

		
		


}
}
