import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
This program:
Creates a Java graphics program that displays an order menu and bill from a sandwich shop.
Items are selected via a Order Calculator and the Message window that displays the 
Subtotal,Tax, and Total is displayed with the Calculate Button is pressed

@author Timothy McWatters
@version 1.0

COP3022    Project 6
File Name: OrderCalculator.java
*/

public class OrderCalculator extends JFrame {
	
	private final double TAX = 0.06;
	
	private Welcome welcome = null;
	
	private Bread bread = null;
	private MeatCheese meatCheese = null;
	private Coffee coffee; 
	
	private JPanel buttonPanel = null;
	private JButton calculate = null;
	private JButton exit = null;
	
	/**
	 * Default constructor for the OrderCalculator class
	 */
	public OrderCalculator() {
		setTitle("Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//create 5 panels
		welcome = new Welcome();
		bread = new Bread();
		meatCheese = new MeatCheese();
		coffee = new Coffee();
		orderCalculations();
		
		//places the 5 panels in the correct locations on the menu
		add(welcome, BorderLayout.NORTH);
		add(bread, BorderLayout.WEST);
		add(meatCheese, BorderLayout.CENTER);
		add(coffee, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	} // end of default constructor

	/**
	 * creates, arranges, and associates the actions for the operation buttons on the deli menu
	 */
	private void orderCalculations() {
		// make a panel to put the calculate and exit buttons
		buttonPanel = new JPanel(); 
		
		// Create the calculate and exit buttons
		calculate = new JButton("Calculate");
		exit = new JButton("Exit");
		
		//Associate the action to the buttons
		calculate.addActionListener(new CalculateListener());
		exit.addActionListener(new ExitListener());
		
		// add the buttons to the button panel
		buttonPanel.add(calculate);
		buttonPanel.add(exit);
	} // end of orderCalculations
	
	/**
	 * CalculateListener is an inner class that provides the actions associated with the calculate button on the
	 * menu. Creates, and arranges a message but also calculates the actual totals.
	 */
	private class CalculateListener implements ActionListener {
		
		public void actionPerformed(ActionEvent calculate) {
			double subtotal = 0.0;
			double tax = 0.0;
			double total = 0.0;
			
			subtotal = (bread.getTotal() + meatCheese.getTotal() + coffee.getTotal());
			tax = subtotal * TAX;
			total = subtotal + tax;
			DecimalFormat US = new DecimalFormat("0.00");
			
			// Generate the message 
			JOptionPane.showMessageDialog(null, "Subtotal: $" + US.format(subtotal) + "\n" + "Tax: $" 
					+ US.format(tax) + "\n" + "Total: $" + US.format(total));
		} // end of the actionPerformed method
		
	} // end of CalculateListener inner class
	
	/**
	 * ExitListener is an inner class that provides the actions associated with the exit button on the
	 * menu. Closes the menu and program.
	 */
	private class ExitListener implements ActionListener {
		
		public void actionPerformed(ActionEvent exit) {
			System.exit(0);
		} // end of the actionPerformed method
	} // end of ExitListener inner class
	
} // end of OrderCalculator class
