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
File Name: Coffee.java
*/

public class Coffee extends JPanel {
	
	public final double NONE_COST = 0.0;
	public final double REGULAR_COST = 0.5;
	public final double DECAF_COST = 0.75;
	public final double CAPPUCCINO_COST = 1.25;
	
	private JRadioButton none = null;
	private JRadioButton regular = null;	
	private JRadioButton decaf = null;
	private JRadioButton cappuccino = null;	
	private ButtonGroup buttonGroup = null;
	
	/**
	 * Default constructor for the Coffee class
	 */
	public Coffee() {
		//creates 4 options for coffee
		setLayout(new GridLayout(4,1));
		
		//make the 4 buttons
		none = new JRadioButton("None");
		regular = new JRadioButton("Regular coffee", true);
		decaf = new JRadioButton("Decaf coffee");
		cappuccino = new JRadioButton("Cappuccino");
		
		//Groups the buttons together as a group to ensure only one is selected
		buttonGroup = new ButtonGroup();
		buttonGroup.add(none);
		buttonGroup.add(regular);
		buttonGroup.add(decaf);
		buttonGroup.add(cappuccino);
		
		//border and label for the coffee panel
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		
		// puts buttons in the border
		add(none);
		add(regular);
		add(decaf);
		add(cappuccino);
	} // end of default constructor
	
	/**
	 * gets the total Cost of the Coffee selected
	 * @return total = the total amount for the Coffee selected
	 */
	public double getTotal() {
		double total = 0.0;
		
		if (none.isSelected()) {
			total = NONE_COST;
		} else if (regular.isSelected()){
			total = REGULAR_COST;
		} else if (decaf.isSelected()) {
			total = DECAF_COST;
		} else if (cappuccino.isSelected()) {
			total = CAPPUCCINO_COST;
		}
		return total;
	} // end of getTotal method
	
} // end of the Coffee class
