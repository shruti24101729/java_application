package calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double first,second,result;
	String operation,ans;

	/**
	 * Launch the application..
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 322, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 286, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String number=textField.getText()+btnNewButton.getText();
//				textField.setText(number);
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(10, 75, 65, 40);
		btnNewButton.setFont(new Font("Wingdings", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setBounds(10, 122, 65, 40);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setBounds(10, 173, 65, 40);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_2);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
		    }
		});
		btn1.setBounds(10, 224, 65, 40);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		
		JButton btnNewButton_5 = new JButton("C");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(null);
			}
		});
		btnNewButton_5.setBounds(85, 75, 65, 40);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_5);
		
		final JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setBounds(85, 122, 65, 40);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_6);
		
		final JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setBounds(85, 173, 65, 40);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_7);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(85, 224, 65, 40);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		
		final JButton btnNewButton_4 = new JButton("00");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(160, 75, 65, 40);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_4);
		
		final JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_9.setBounds(160, 122, 65, 40);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_9);
		
		final JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setBounds(160, 173, 65, 40);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_10);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(160, 224, 65, 40);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//String number=textField.getText()+btnNewButton_12.getText();
				//textField.setText(number);
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_12.setBounds(234, 75, 62, 40);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_12_1 = new JButton("-");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String number=textField.getText()+btnNewButton_12_1.getText();
				//textField.setText(number);
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_12_1.setBounds(235, 122, 61, 40);
		btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_12_1);
		
		JButton btnNewButton_12_2 = new JButton("*");
		btnNewButton_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_12_2.setBounds(234, 173, 62, 40);
		btnNewButton_12_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_12_2);
		
		JButton btnNewButton_12_3 = new JButton("/");
		btnNewButton_12_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_12_3.setBounds(235, 224, 61, 40);
		btnNewButton_12_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton_12_3);
		
		final JButton btnNewButton_3_1 = new JButton("0");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3_1.setBounds(10, 266, 65, 31);
		frame.getContentPane().add(btnNewButton_3_1);
		
		final JButton btnNewButton_3_1_1 = new JButton(".");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3_1_1.setBounds(85, 266, 65, 31);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_2 = new JButton("=");
		btnNewButton_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second =Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") 
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") 
					
				{
					
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") 
					
				{
					
					if(second!=0)
					{
						result=first/second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else
						textField.setText("error");
					
				}
				else if(operation=="%") 
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3_1_2.setBounds(160, 266, 65, 31);
		frame.getContentPane().add(btnNewButton_3_1_2);
		
		JButton btnNewButton_12_3_1 = new JButton("%");
		btnNewButton_12_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_12_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_3_1.setBounds(234, 268, 62, 26);
		frame.getContentPane().add(btnNewButton_12_3_1);
	}
}
