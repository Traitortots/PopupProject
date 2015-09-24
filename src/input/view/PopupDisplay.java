package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class, Used for showing input and output.
 * @author Jared Kerr
 * @version 1.0 09/24/15
 */
public class PopupDisplay
{
	
	public void showResponce(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
		
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		JOptionPane.showInputDialog(null, stuff);
		
		
		return answer;
	}
	
}