import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
This program:
Creates a Java graphics program that displays an order menu and bill from a sandwich shop.
Items are selected via a Order Calculator and the Message window that displays the 
Subtotal,Tax, and Total is displayed with the Calculate Button is pressed

@author Timothy McWatters
@version 1.0

COP3022    Project 6
File Name: MeatCheese.java
*/

public class MeatCheese extends JPanel {
	
	public final double CHEESE_COST = 0.5;
	public final double ROASTBEEF_COST = 1.0;
	public final double TURKEY_COST = 0.75;
	public final double HAM_COST = 0.5;
	
	private JCheckBox cheese = null;
	private JCheckBox roastBeef = null;
	private JCheckBox turkey = null;
	private JCheckBox ham = null;
	
	/**
	 * Default constructor for the MeatCheese class
	 */
	public MeatCheese() {
		//make the 4 options for MeatCheese
		setLayout(new GridLayout(4,1));
		
		//make check boxes
		cheese = new JCheckBox("Cheese");
		roastBeef = new JCheckBox("Roast Beef");
		turkey = new JCheckBox("Turkey");
		ham = new JCheckBox("Ham");
		
		// border and label for the meat cheese panel
		setBorder(BorderFactory.createTitledBorder("Meat/Cheese"));
		
		// put the check boxes in the border
		add(cheese);
		add(roastBeef);
		add(turkey);
		add(ham);
	} // end of default constructor
	
	/**
	 * gets the total Cost of the meats or cheese selected
	 * @return total = the total amount for the meats or cheese selected
	 */
	public double getTotal() {
		double total = 0.0;
		
		if (cheese.isSelected()) {
			total += CHEESE_COST;
		} if (roastBeef.isSelected()) {
			total += ROASTBEEF_COST;
		} if (turkey.isSelected()) {
			total += TURKEY_COST;
		} if (ham.isSelected()) {
			total += HAM_COST;
		}
		return total;
	} // end of getTotal method
	
} // end of MeatCheese class
