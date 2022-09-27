package UebungenGUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class UebungGUI extends JFrame {

	private JPanel contentPane;
	private JTextField eingabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UebungGUI frame = new UebungGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UebungGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("W\u00C4HRUNGUMRECHNER");
		lblNewLabel.setBounds(5, 5, 426, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		eingabe = new JTextField();
		eingabe.setColumns(10);
		eingabe.setBounds(169, 71, 96, 20);
		contentPane.add(eingabe);
		
		JLabel lblNewLabel_1 = new JLabel("Eingabe");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(195, 58, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JRadioButton euroRadioButton = new JRadioButton("Euro");
		euroRadioButton.setSelected(true);
		euroRadioButton.setBounds(169, 98, 111, 23);
		contentPane.add(euroRadioButton);
		
		JRadioButton dollarRadioButton = new JRadioButton("Dollar");
		dollarRadioButton.setSelected(true);
		dollarRadioButton.setBounds(169, 120, 111, 23);
		contentPane.add(dollarRadioButton);
	    
	    JRadioButton auDollarRadioButton = new JRadioButton("Australischer Dollar");
	    auDollarRadioButton.setSelected(true);
	    auDollarRadioButton.setBounds(169, 141, 133, 23);
	    contentPane.add(auDollarRadioButton);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(dollarRadioButton);
	    group.add(euroRadioButton);
	    group.add(auDollarRadioButton);
	    
	    JLabel outputEUR = new JLabel("0 Euro");
	    outputEUR.setHorizontalAlignment(SwingConstants.CENTER);
	    outputEUR.setBounds(195, 210, 49, 14);
	    contentPane.add(outputEUR);
	    
	    JLabel outputDollar = new JLabel("0 Dollar");
	    outputDollar.setHorizontalAlignment(SwingConstants.CENTER);
	    outputDollar.setBounds(253, 210, 111, 14);
	    contentPane.add(outputDollar);
	    
	    JLabel outputAuDollar = new JLabel("0 AU-Dollar");
	    outputAuDollar.setHorizontalAlignment(SwingConstants.CENTER);
	    outputAuDollar.setBounds(74, 210, 111, 14);
	    contentPane.add(outputAuDollar);
	    
	    JButton btnNewButton = new JButton("Umrechnung");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if (euroRadioButton.isSelected() == true) {
	    			outputEUR.setText(eingabe.getText() + " Euro");
	    			
	    			double zEingabe = Double.parseDouble(eingabe.getText());
	    			double dollarErgebnis = zEingabe * 1.06;
	    			outputDollar.setText(dollarErgebnis + " Dollar");
	    			double auDollarErgebnis = zEingabe * 1.53;
	    			outputAuDollar.setText(auDollarErgebnis + " Au-Dollar");
	    			
	    		} else if (dollarRadioButton.isSelected() == true) {
	    			outputDollar.setText(eingabe.getText() + " Dollar");
	    			
	    			double zEingabe = Double.parseDouble(eingabe.getText());
	    			double eurErgebnis = zEingabe * 0.94;
	    			outputEUR.setText(eurErgebnis + " Euro");
	    			double auDollarErgebnis = zEingabe * 1.44;
	    			outputAuDollar.setText(auDollarErgebnis + " Au-Dollar");
	    			
	    		} else if (auDollarRadioButton.isSelected() == true) {
	    			outputAuDollar.setText(eingabe.getText() + " Au-Dollar");
	    			
	    			double zEingabe = Double.parseDouble(eingabe.getText());
	    			double eurErgebnis = zEingabe * 0.66;
	    			outputEUR.setText(eurErgebnis + " Euro");
	    			double dollarErgebnis = zEingabe * 0.69;
	    			outputDollar.setText(dollarErgebnis + " Dollar");
	    		}
	    			
	    		
	    		
	    	}
	    });
	    btnNewButton.setBounds(149, 171, 144, 23);
	    contentPane.add(btnNewButton);
		
	}
}
