import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
This program:
Creates a Java graphics program that displays an order menu and bill from a sandwich shop.
Items are selected via a Order Calculator and the Message window that displays the 
Subtotal,Tax, and Total is displayed with the Calculate Button is pressed

@author Timothy McWatters
@version 1.0

COP3022    Project 6
File Name: Bread.java
*/

public class Bread extends JPanel {
	
	public final double WHITE_COST = 0.5;
	public final double WHEAT_COST = 0.75;
	
	private JRadioButton white = null;
	private JRadioButton wheat = null;	
	private ButtonGroup buttonGroup = null;
	
	/**
	 * Default constructor for the Bread class
	 */
	public Bread() {
		//creates two options for bread
		setLayout(new GridLayout(2,1));
		
		//make the 2 buttons
		white = new JRadioButton("White", true);
		wheat = new JRadioButton("Wheat");
		
		//Groups the buttons together as a group to ensure only one is selected
		buttonGroup = new ButtonGroup();
		buttonGroup.add(white);
		buttonGroup.add(wheat);
		
		//border and label for the bread panel
		setBorder(BorderFactory.createTitledBorder("Bread"));
		
		// puts buttons in the border
		add(white);
		add(wheat);
	} // end of default constructor
	
	/**
	 * gets the total Cost of the bread selected
	 * @return total = the total amount for the bread selected
	 */
	public double getTotal() {
		double total = 0.0;
		
		if (white.isSelected()) {
			total = WHITE_COST;
		} else {
			total = WHEAT_COST;
		}
		return total;
	} // end of getTotal method
	
} // end of Bread class
