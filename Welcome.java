import javax.swing.JLabel;
import javax.swing.JPanel;

/**
This program:
Creates a Java graphics program that displays an order menu and bill from a sandwich shop.
Items are selected via a Order Calculator and the Message window that displays the 
Subtotal,Tax, and Total is displayed with the Calculate Button is pressed

@author Timothy McWatters
@version 1.0

COP3022    Project 6
File Name: Welcome.java
*/

public class Welcome extends JPanel {
	
	private JLabel welcome = null;
	
	/**
	 * Default constructor for the Welcome class
	 */
	public Welcome() {
		//creates the welcome label
		welcome = new JLabel("Welcome to the McWatters' Deli");
		
		//puts the message on the menu
		add(welcome);
		
	} // end of default constructor
	
} // end of Welcome class
