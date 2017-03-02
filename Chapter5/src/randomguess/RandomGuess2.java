/**
 * 
 */
package randomguess;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author ZD131147
 *
 */
public class RandomGuess2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result1 = r.nextInt(9);
		int result2 = r.nextInt(9);
		int result3 = r.nextInt(9);
		
		int userGuess1;
		int userGuess2;
		int userGuess3;
		int response;
		
		userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		
		
		if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3 )
		{
			msg = "\n You win a million f****** dollars!";
		}
		if(userGuess1 == result1 || userGuess2 != result2 || userGuess3 != result3)
		{
			msg = "\n You got the first digit right!";
		}
		
		if(userGuess1 != result1 && userGuess2 == result2 && userGuess3 != result3)
		{
			msg = "\n You got the second digit right!";
		}
		if(userGuess1 != result1 && userGuess2 != result2 && userGuess3 == result3)
		{
			msg = "\n You got the third digit right!";
		}
		else
			msg = "/n You suck, you got none of the digits right get your *** out of my casino!";
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result1 + ", " + result2 + ", and " + result3 + msg);
		
		
	}while(response == 1);
	System.out.println("Would you like to try again big boi?")
	
	{
		
		
		
		
		
	}

}
