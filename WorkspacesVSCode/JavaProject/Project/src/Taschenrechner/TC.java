package Taschenrechner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class TC extends JFrame {

	private JPanel contentPane;
	private JTextField Zahl1;
	private JTextField Zahl2;
	private JTextField ErgebnisVAR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TC frame = new TC();
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
	public TC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setBounds(100, 100, 450, 300);
		Zahl1 = new JTextField();
		Zahl1.setBounds(10, 25, 96, 20);
		contentPane.add(Zahl1);
		Zahl1.setColumns(10);
		
		Zahl2 = new JTextField();
		Zahl2.setBounds(128, 25, 96, 20);
		contentPane.add(Zahl2);
		Zahl2.setColumns(10);
		
		ErgebnisVAR = new JTextField();
		ErgebnisVAR.setBounds(309, 152, 96, 20);
		contentPane.add(ErgebnisVAR);
		ErgebnisVAR.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Zahl 1");
		lblNewLabel.setBounds(10, 11, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zahl 2");
		lblNewLabel_1.setBounds(128, 11, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ergebnis");
		lblNewLabel_2.setBounds(309, 138, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton Plus = new JButton("+");
		Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SZahl1 = Zahl1.getText();
				float Zahl1 = Float.parseFloat(SZahl1);
				String SZahl2 = Zahl2.getText();
				float Zahl2 = Float.parseFloat(SZahl2);
				float Ergebnis = Zahl1 + Zahl2;
				ErgebnisVAR.setText(Ergebnis + "");
			}
		});
		Plus.setBounds(17, 116, 89, 23);
		contentPane.add(Plus);
		
		JButton Minus = new JButton("-");
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SZahl1 = Zahl1.getText();
				float Zahl1 = Float.parseFloat(SZahl1);
				String SZahl2 = Zahl2.getText();
				float Zahl2 = Float.parseFloat(SZahl2);
				float Ergebnis = Zahl1 - Zahl2;
				ErgebnisVAR.setText(Ergebnis + "");
		
			}
		});
		Minus.setBounds(135, 116, 89, 23);
		contentPane.add(Minus);
		
		JButton Mal = new JButton("*");
		Mal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SZahl1 = Zahl1.getText();
				float Zahl1 = Float.parseFloat(SZahl1);
				String SZahl2 = Zahl2.getText();
				float Zahl2 = Float.parseFloat(SZahl2);
				float Ergebnis = Zahl1 * Zahl2;
				ErgebnisVAR.setText(Ergebnis + "");
			}
		});
		Mal.setBounds(17, 165, 89, 23);
		contentPane.add(Mal);
		
		JButton Durch = new JButton("/");
		Durch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SZahl1 = Zahl1.getText();
				float Zahl1 = Float.parseFloat(SZahl1);
				String SZahl2 = Zahl2.getText();
				float Zahl2 = Float.parseFloat(SZahl2);
				
				if(Zahl2 != 0) {
					float Ergebnis = Zahl1 / Zahl2;
					ErgebnisVAR.setText(Ergebnis + "");
				} else {
					ErgebnisVAR.setText("Fehler");
				}
				
			}
		});
		Durch.setBounds(135, 165, 89, 23);
		contentPane.add(Durch);
		
		JButton Wurzel = new JButton("\u221A");
		Wurzel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SZahl1 = Zahl1.getText();
				float Zahl1 = Float.parseFloat(SZahl1);
				
				if(Zahl1 >= 0) {
					double Ergebnis = Math.sqrt(Zahl1);
					ErgebnisVAR.setText(Ergebnis + "");
				} else {
					ErgebnisVAR.setText("Keine Minus Zahlen!");
				}
			}
		});
		Wurzel.setBounds(17, 215, 89, 23);
		contentPane.add(Wurzel);
		
		JButton LOG = new JButton("log");
		LOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//IN BEARBEITUNG
			}
		});
		LOG.setBounds(135, 215, 89, 23);
		contentPane.add(LOG);
	}
}
