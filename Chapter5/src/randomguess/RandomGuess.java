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
public class RandomGuess {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 100;
		final int HIGH = 1000;
		String msg;
		int result = r.nextInt(10) + LOW;
		int userGuess;
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		
		if(userGuess == result)
			msg = "\n Your guess was correct!";
		else
			if(userGuess < result)
				msg = "\n Your guess was too low";	
	        else
	        	msg = "\n Your guess was too high";
		
		JOptionPane.showMessageDialog(null, "The number is " + result + msg);
	        
			

	}

}
