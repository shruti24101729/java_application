package currency;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class currency {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d=Double.parseDouble(textField.getText());
				double d1=(d/65.25);
				double d2=(d/20.95);
				textField_1.setText(String.valueOf(d1));
				textField_2.setText(String.valueOf(d2));
			}
		});
		btnNewButton.setBounds(22, 37, 89, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUsd = new JButton("USD");
		btnUsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d=Double.parseDouble(textField_1.getText());
				double d1=(d*65.25);
				double d2=(d*3.67);
				textField.setText(String.valueOf(d1));
				textField_2.setText(String.valueOf(d2));
			}
		});
		btnUsd.setBounds(22, 105, 89, 43);
		frame.getContentPane().add(btnUsd);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setBounds(212, 37, 186, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(211, 105, 186, 43);
		frame.getContentPane().add(textField_1);
		
		JButton btnAed = new JButton("AED");
		btnAed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d=Double.parseDouble(textField_2.getText());
				double d1=(d*20.95);
				double d2=(d*0.27);
				textField.setText(String.valueOf(d1));
				textField_1.setText(String.valueOf(d2));
			}
		});
		btnAed.setBounds(22, 174, 89, 43);
		frame.getContentPane().add(btnAed);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(212, 174, 186, 43);
		frame.getContentPane().add(textField_2);
	}
}
