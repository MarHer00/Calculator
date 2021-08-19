import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Taschenrechner {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taschenrechner window = new Taschenrechner();
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
	public Taschenrechner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 368, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton bAC = new JButton("AC");
		bAC.setBounds(40, 134, 62, 62);
		frame.getContentPane().add(bAC);
		
		JButton bSQRT = new JButton("SQRT");
		bSQRT.setBounds(113, 134, 62, 62);
		frame.getContentPane().add(bSQRT);
		
		JButton bPerc = new JButton("%");
		bPerc.setBounds(187, 134, 62, 62);
		frame.getContentPane().add(bPerc);
		
		JButton bplus = new JButton("+");
		bplus.setBounds(266, 134, 62, 62);
		frame.getContentPane().add(bplus);
		
		JButton b1 = new JButton("1");
		b1.setBounds(39, 207, 62, 62);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(113, 207, 62, 62);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.setBounds(187, 207, 62, 62);
		frame.getContentPane().add(b3);
		
		JButton bMinus = new JButton("-");
		bMinus.setBounds(266, 207, 62, 62);
		frame.getContentPane().add(bMinus);
		
		JButton b4 = new JButton("4");
		b4.setBounds(39, 280, 62, 62);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(113, 280, 62, 62);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(187, 280, 62, 62);
		frame.getContentPane().add(b6);
		
		JButton bTimes = new JButton("*");
		bTimes.setBounds(266, 280, 62, 62);
		frame.getContentPane().add(bTimes);
		
		JButton b7 = new JButton("7");
		b7.setBounds(39, 353, 62, 62);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(113, 353, 62, 62);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(187, 353, 62, 62);
		frame.getContentPane().add(b9);
		
		JButton bDivide = new JButton("/");
		bDivide.setBounds(266, 353, 62, 62);
		frame.getContentPane().add(bDivide);
		
		JButton b0 = new JButton("0");
		b0.setBounds(39, 426, 62, 62);
		frame.getContentPane().add(b0);
		
		JButton bDot = new JButton(",");
		bDot.setBounds(113, 426, 62, 62);
		frame.getContentPane().add(bDot);
		
		JButton bNegative = new JButton("+/-");
		bNegative.setBounds(187, 426, 62, 62);
		frame.getContentPane().add(bNegative);
		
		JButton bEquals = new JButton("=");
		bEquals.setBounds(266, 426, 62, 62);
		frame.getContentPane().add(bEquals);
		
		textField = new JTextField();
		textField.setBounds(40, 24, 288, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
