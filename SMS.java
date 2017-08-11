import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;

public class SMS {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField jtxtQuantity;
	private JTextField jtxtCurrency;

	double firtnum;
	double secondnum;
	double result;
	String operations;
	
	double [] i = new double[5];
	
	
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMS window = new SMS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SMS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\odigietony\\Pictures\\4-BonafideRestaurant.jpg"));
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 54, 596, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		final JLabel jlblChickenBurger = new JLabel("Chicken Burger");
		jlblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblChickenBurger.setBounds(34, 46, 158, 32);
		panel.add(jlblChickenBurger);
		
		final JLabel jlblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		jlblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblChickenBurgerMeal.setBounds(34, 89, 215, 32);
		panel.add(jlblChickenBurgerMeal);
		
		final JLabel jlblCheeseBurger = new JLabel("Cheese Burger");
		jlblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblCheeseBurger.setBounds(34, 132, 158, 28);
		panel.add(jlblCheeseBurger);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtxtChicBurger.setText(null);
			}
			 
		});
		jtxtChicBurger.setText("0");
		jtxtChicBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtChicBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChicBurger.setBounds(313, 42, 215, 32);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtxtChicBurgerMeal.setText(null);
			}
		});
		jtxtChicBurgerMeal.setText("0");
		jtxtChicBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtChicBurgerMeal.setHorizontalAlignment(SwingConstants.TRAILING);
		jtxtChicBurgerMeal.setColumns(10);
		jtxtChicBurgerMeal.setBounds(313, 89, 215, 32);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtCheeseBurger = new JTextField();
		jtxtCheeseBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtxtCheeseBurger.setText(null);
			}
			 
		});
		jtxtCheeseBurger.setText("0");
		jtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.TRAILING);
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(313, 134, 215, 32);
		panel.add(jtxtCheeseBurger);
		
		final JLabel jlblDrinks = new JLabel("Drinks");
		jlblDrinks.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlblDrinks.setBounds(34, 177, 82, 25);
		panel.add(jlblDrinks);
		
		final JComboBox jcmbDrinks = new JComboBox();
		jcmbDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jcmbDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Coke", "Fanta", "Pepsi", "Sprite", "Coffie", "Apple tini"}));
		jcmbDrinks.setBounds(34, 213, 143, 25);
		panel.add(jcmbDrinks);
		
		final JRadioButton jrdbtnHomeDelivery = new JRadioButton("Home Delivery");
		jrdbtnHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		jrdbtnHomeDelivery.setBounds(34, 253, 143, 23);
		panel.add(jrdbtnHomeDelivery);
		
		final JLabel jlblQty = new JLabel("Qty");
		jlblQty.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlblQty.setBounds(313, 181, 70, 17);
		panel.add(jlblQty);
		
		jtxtQuantity = new JTextField();
		jtxtQuantity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtxtQuantity.setText(null);
			}
			 
		});
		jtxtQuantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtQuantity.setText("0");
		jtxtQuantity.setHorizontalAlignment(SwingConstants.TRAILING);
		jtxtQuantity.setColumns(10);
		jtxtQuantity.setBounds(313, 209, 215, 32);
		panel.add(jtxtQuantity);
		
		final JRadioButton jrdbtnTax = new JRadioButton("Tax");
		jrdbtnTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		jrdbtnTax.setBounds(313, 253, 109, 23);
		panel.add(jrdbtnTax);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 176, 520, 8);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(635, 54, 279, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "NGR", "USA", "EUR", "BRL"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jcmbCurrency.setBounds(44, 56, 165, 25);
		panel_1.add(jcmbCurrency);
		
		jtxtCurrency = new JTextField();
		jtxtCurrency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtCurrency.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtCurrency.setColumns(10);
		jtxtCurrency.setBounds(30, 104, 215, 47);
		panel_1.add(jtxtCurrency);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		jbtnConvert.setBounds(30, 228, 96, 34);
		panel_1.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Close");
		jbtnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnClose.setBounds(149, 228, 89, 34);
		panel_1.add(jbtnClose);
		
		final JLabel jlblCurrency = new JLabel("");
		jlblCurrency.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCurrency.setBounds(30, 172, 215, 28);
		panel_1.add(jlblCurrency);
		
		final JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCurrencyConverter.setBounds(34, 11, 215, 34);
		panel_1.add(lblCurrencyConverter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(635, 365, 279, 194);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		final JLabel jlblTax = new JLabel("Tax");
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblTax.setBounds(20, 11, 67, 28);
		panel_2.add(jlblTax);
		
		final JLabel jlblSubTotal = new JLabel("Sub Total");
		jlblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblSubTotal.setBounds(20, 65, 106, 32);
		panel_2.add(jlblSubTotal);
		
		final JLabel jlblTotal = new JLabel("Total");
		jlblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblTotal.setBounds(20, 114, 67, 28);
		panel_2.add(jlblTotal);
		
		final JLabel jlblTax2 = new JLabel("");
		jlblTax2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblTax2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblTax2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax2.setBounds(129, 11, 126, 28);
		panel_2.add(jlblTax2);
		
		final JLabel jlblSubTotal2 = new JLabel("");
		jlblSubTotal2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblSubTotal2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblSubTotal2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal2.setBounds(129, 65, 126, 28);
		panel_2.add(jlblSubTotal2);
		
		final JLabel jlblTotal2 = new JLabel("");
		jlblTotal2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblTotal2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblTotal2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal2.setBounds(129, 114, 126, 28);
		panel_2.add(jlblTotal2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(10, 365, 596, 194);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		final JLabel jlblCostOfDrinks = new JLabel("Cost of Drinks");
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblCostOfDrinks.setBounds(28, 27, 158, 32);
		panel_3.add(jlblCostOfDrinks);
		
		final JLabel jlblCostOfMeal = new JLabel("Cost of meal");
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblCostOfMeal.setBounds(28, 70, 215, 39);
		panel_3.add(jlblCostOfMeal);
		
		final JLabel jlblCostOfDelivery = new JLabel("Cost of Delivery");
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlblCostOfDelivery.setBounds(28, 130, 215, 28);
		panel_3.add(jlblCostOfDelivery);
		
		final JLabel jlblCostOfDrinks2 = new JLabel("0");
		jlblCostOfDrinks2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblCostOfDrinks2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblCostOfDrinks2.setBounds(360, 26, 168, 28);
		panel_3.add(jlblCostOfDrinks2);
		jlblCostOfDrinks2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		final JLabel jlblCostOfMeal2 = new JLabel("0");
		jlblCostOfMeal2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblCostOfMeal2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblCostOfMeal2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal2.setBounds(360, 81, 168, 28);
		panel_3.add(jlblCostOfMeal2);
		
		final JLabel jlblCostOfDelivery2 = new JLabel("0");
		jlblCostOfDelivery2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jlblCostOfDelivery2.setHorizontalAlignment(SwingConstants.TRAILING);
		jlblCostOfDelivery2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery2.setBounds(360, 130, 168, 28);
		panel_3.add(jlblCostOfDelivery2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(924, 54, 324, 505);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 37, 279, 443);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		final JTextPane jtxtReceipt = new JTextPane();
		jtxtReceipt.setBounds(10, 11, 254, 393);
		panel_6.add(jtxtReceipt);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 570, 1238, 69);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double burger = 0;
				double burgerMeal = 0;
				double cheese = 0;
				double hDelivery = 3.39;
				double coke = 2.99;
				double fanta = 2.99;
				double sprite = 2.99;
				double pepsi = 2.99;
				double coffie = 0.90;
				double appleTini = 5.99;
				double ichicBurger = 2.39;
				double ichicBurgerM = 4.39;
				double ichicCheese = 3.39;
    		    double chicBurger = Double.parseDouble(jtxtChicBurger.getText());
				double chicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double cheeseBurger = Double.parseDouble(jtxtCheeseBurger.getText());
				double Drinks = Double.parseDouble(jtxtQuantity.getText());
				
				String priceOfMeal;
				String hdelivery;
				
//==================================== MEAL =======================================================	
				
			burger = (chicBurger * ichicBurger);
			burgerMeal = (chicBurgerMeal * ichicBurgerM);
			cheese = (cheeseBurger * ichicCheese);
			if(jtxtChicBurgerMeal.getText().equals("0") && jtxtCheeseBurger.getText().equals("0")){
				priceOfMeal = String.format("%.2f", burger);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else if(jtxtCheeseBurger.getText().equals("0")){
				priceOfMeal = String.format("%.2f", burger + burgerMeal);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else if(jtxtChicBurgerMeal.getText().equals("0")){
				priceOfMeal = String.format("%.2f", burger + cheese);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else if(jtxtChicBurger.getText().equals("0")){
				priceOfMeal = String.format("%.2f", burgerMeal + cheese);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else if(jtxtChicBurger.getText().equals("0") && jtxtCheeseBurger.getText().equals("0")){
				priceOfMeal = String.format("%.2f", burgerMeal);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else if(jtxtChicBurger.getText().equals("0") && jtxtChicBurgerMeal.getText().equals("0")){
				priceOfMeal = String.format("%.2f", cheese);
				jlblCostOfMeal2.setText(priceOfMeal);
			}else{
				priceOfMeal = String.format("%.2f", burger + burgerMeal + cheese);
				jlblCostOfMeal2.setText(priceOfMeal);
			}
			
//====================================HOME DELIVERY=======================================================		
			
			if(jrdbtnHomeDelivery.isSelected()){
				hdelivery = String.format("%.2f", hDelivery);
				jlblCostOfDelivery2.setText(hdelivery);
			}else{
				jlblCostOfDelivery2.setText("0");
			}
			
//==================================== DRINKS =======================================================	
			
			if(jcmbDrinks.getSelectedItem().equals("Coke")){
				 String Coke = String.format("%.2f", coke * Drinks);
				 jlblCostOfDrinks2.setText(Coke);
			 }if(jcmbDrinks.getSelectedItem().equals("Fanta")){
				 String Fanta = String.format("%.2f", fanta * Drinks);
				 jlblCostOfDrinks2.setText(Fanta);
			 }if(jcmbDrinks.getSelectedItem().equals("Pepsi")){
				 String Pepsi = String.format("%.2f",pepsi* Drinks);
				 jlblCostOfDrinks2.setText(Pepsi);
			 }if(jcmbDrinks.getSelectedItem().equals("Sprite")){
				 String Sprite = String.format("%.2f",sprite * Drinks);
				 jlblCostOfDrinks2.setText(Sprite);
			 }if(jcmbDrinks.getSelectedItem().equals("Coffie")){
				 String Coffie = String.format("%.2f",coffie * Drinks);
				 jlblCostOfDrinks2.setText(Coffie);
			 }if(jcmbDrinks.getSelectedItem().equals("Apple Tini")){
				 String Apple_Tini = String.format("%.2f", appleTini * Drinks);
				 jlblCostOfDrinks2.setText(Apple_Tini);
			 }
			
 //==================================== TAX =======================================================					
			    double cTotal1 = Double.parseDouble(jlblCostOfDrinks2.getText());
				double cTotal2 = Double.parseDouble(jlblCostOfMeal2.getText());
				double cTotal3 = Double.parseDouble(jlblCostOfDelivery2.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3) / 100;
			 if(jrdbtnTax.isSelected()){
				String iTotal = String.format("%.2f", AllTotal);
				jlblTax2.setText(iTotal);
			}
			 
 //==================================== TOTAL =======================================================				 
	
			 double cTotal4 = Double.parseDouble(jlblTax2.getText());
			 String taxTotal = String.format("$ %.2f", cTotal4);
			 jlblTax2.setText(taxTotal);
			 
			 double subTotal = (cTotal1 + cTotal2 + cTotal3);
			 String subtotal = String.format("$ %.2f", subTotal);
			 jlblSubTotal2.setText(subtotal);
			 
			 double total = (subTotal + cTotal4);
			 String Total = String.format("$%.2f", total);
			 jlblTotal2.setText(Total);
		}
		});
		jbtnTotal.setBounds(310, 22, 89, 23);
		panel_5.add(jbtnTotal);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jtxtCheeseBurger.getText());
				//double Qty4 = Double.parseDouble(jlblTotal2.getText());
				//String Qty = String.format("%.2f", Qty4);
				jtxtReceipt.setText("\t\nResturant Management System:\n\n" + "Chicken Burger:\t\t" + 
				 Qty1 + "\nChicken Burger Meal:\t\t"+ Qty2 + "\nCheese Burger:\t\t " + Qty3 + "\nTotal Price:\t\t"
				 +  "\n\nThanks For Using job Estimator!!"
						);
			}
		});
		jbtnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnReceipt.setBounds(533, 22, 89, 23);
		panel_5.add(jbtnReceipt);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxtChicBurger.setText("0");
				jtxtChicBurgerMeal.setText("0");
				jtxtCheeseBurger.setText("0");
				jtxtQuantity.setText("0");
				jtxtCurrency.setText("0"); 
				jlblCostOfDrinks2.setText("0");
				jlblCostOfMeal2.setText("0");
				jlblCostOfDelivery2.setText("0");
				jlblCurrency.setText(null);
				jlblTax2.setText(null);
				jlblSubTotal2.setText(null);
				jlblTotal2.setText(null);
				jcmbDrinks.setSelectedItem("Select a Drink");
				jcmbCurrency.setSelectedItem("Choose one");
				
				
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnReset.setBounds(795, 22, 89, 23);
		panel_5.add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnExit.setBounds(1019, 22, 89, 23);
		panel_5.add(jbtnExit);
		
		JLabel lblNewLabel = new JLabel("Resturant Management System");
		lblNewLabel.setFont(new Font("Brush Script MT", Font.BOLD, 52));
		lblNewLabel.setBounds(332, 11, 655, 39);
		frame.getContentPane().add(lblNewLabel);
	}
}
