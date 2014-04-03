package original;

import javax.swing.JOptionPane;


public class number_guess2 {

	/**
	 * @param args
	 */
	
	public static boolean isNumeric(String strNum) {
	    boolean numeric = true;
	    //unless the exception is caught, the number is numeric and will stop the inner loop.
	    try {

	        Integer.parseInt(strNum);

	    }catch (NumberFormatException e) {
	        numeric = false;
	        //the number is not numeric, and does not trigger the break.
	    }
	    return numeric;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null,"guess the number! ( 0-100 inclusive)");
		

		int target = (int)(Math.random()*100);
		
		// the line below is used in the testing phase		
		//System.out.println(target);
		
		
		// we increment after a guess is computed, so counter should hold the value the guess you are on. eg we have the first guess coming up
		int counter=1;	
		
		while (true)
		{
			
			int input_num=0;
			
			boolean num_numeric=true;
			


					// validate for non numeric input
					while(true)
					{
						
						String input_string =  JOptionPane.showInputDialog("enter an integer 0-100 inclusive "+(7-counter)+"guesses remaining");
						
						num_numeric=isNumeric(input_string);
						
						// this means, if the number is numeric, parse to integer, sets to input_num, and breaks out of this loop.
						if (num_numeric==true)
						{
							input_num=Integer.parseInt(input_string);
							break;
						}
					}



			



			
					//check the number is within our range
					while (input_num<0 || input_num>100)
						{
						input_num =  Integer.parseInt(JOptionPane.showInputDialog("that number is outside the range 0-100. "+(7-counter)+"guesses remaining"));
						}
			
					
				//calculate the residual, otherwise known as the (signed) difference.
				int residual=input_num-target;
			
			
			
			
			//when the input is larger ( overestimated)
			if (residual>=50)
			{
		        JOptionPane.showMessageDialog(null,"your guess is very high");
			}
			if (residual<50 && residual>=30)
			{
		        JOptionPane.showMessageDialog(null,"your guess is high");
			}
			if (residual<30 && residual>=15)
			{
		        JOptionPane.showMessageDialog(null,"your guess is moderately high");
			}
			if (residual>0 && residual<15)
			{
		        JOptionPane.showMessageDialog(null,"your guess is somewhat high");
			}
			
			//and when the target is bigger ( underestimated)
			if (residual<=-50)
			{
		        JOptionPane.showMessageDialog(null,"your guess is very low");
			}
			if (residual>-50 && residual<=-30)
			{
		        JOptionPane.showMessageDialog(null,"your guess is low");
			}
			if (residual>-30 && residual<=-15)
			{
		        JOptionPane.showMessageDialog(null,"your guess is moderately low");
			}
			if (residual<0 && residual>-15)
			{
		        JOptionPane.showMessageDialog(null,"your guess is somewhat low");
			}
			
			//two different break conditions, guessed correctly or out of guesses
			if (residual==0)
			{
				JOptionPane.showMessageDialog(null,"well done, the number was "+target+", and you took "+counter+" guesses");
		       break;
			}
			if (counter==6)
			{
				JOptionPane.showMessageDialog(null,"sorry, the number was "+target+", and you used up your "+counter+" guesses");
		       break;
			}
			
			counter++;
			
		}
		


	}

}
