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
		bAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAC_actionPerformed(e);
			}
		});
		bAC.setBounds(40, 134, 62, 62);
		frame.getContentPane().add(bAC);
		
		JButton bSQRT = new JButton("SQRT");
		bSQRT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bSQRT_actionPerformed(e);
			}
		});
		bSQRT.setBounds(113, 134, 62, 62);
		frame.getContentPane().add(bSQRT);
		
		JButton bPerc = new JButton("%");
		bPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPerc_actionPerformed(e);
			}
		});
		bPerc.setBounds(187, 134, 62, 62);
		frame.getContentPane().add(bPerc);
		
		JButton bPlus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPlus_actionPerformed(e);
			}
		});
		bplus.setBounds(266, 134, 62, 62);
		frame.getContentPane().add(bplus);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAZahl_actionPerformed(e, 1);
			}
		});
		b1.setBounds(39, 207, 62, 62);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 2);
			}
		});
		b2.setBounds(113, 207, 62, 62);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 3);
			}
		});
		b3.setBounds(187, 207, 62, 62);
		frame.getContentPane().add(b3);
		
		JButton bMinus = new JButton("-");
		bMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bMinus_actionPerformed(e);
			}
		});
		bMinus.setBounds(266, 207, 62, 62);
		frame.getContentPane().add(bMinus);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 4);
			}
		});
		b4.setBounds(39, 280, 62, 62);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 5);
			}
		});
		b5.setBounds(113, 280, 62, 62);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 6);
			}
		});
		b6.setBounds(187, 280, 62, 62);
		frame.getContentPane().add(b6);
		
		JButton bTimes = new JButton("*");
		bTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bTimes_actionPerformed(e);
			}
		});
		bTimes.setBounds(266, 280, 62, 62);
		frame.getContentPane().add(bTimes);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 7);
			}
		});
		b7.setBounds(39, 353, 62, 62);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 8);
			}
		});
		b8.setBounds(113, 353, 62, 62);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 9);
			}
		});
		b9.setBounds(187, 353, 62, 62);
		frame.getContentPane().add(b9);
		
		JButton bDivide = new JButton("/");
		bDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bDivide_actionPerformed(e);
			}
		});
		bDivide.setBounds(266, 353, 62, 62);
		frame.getContentPane().add(bDivide);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bZahl_actionPerformed(e, 0);
			}
		});
		b0.setBounds(39, 426, 62, 62);
		frame.getContentPane().add(b0);
		
		JButton bDot = new JButton(",");
		bDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bDot_actionPerformed(e);
			}
		});
		bDot.setBounds(113, 426, 62, 62);
		frame.getContentPane().add(bDot);
		
		JButton bNegative = new JButton("+/-");
		bNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bNegative_actionPerformed(e);
			}
		});
		bNegative.setBounds(187, 426, 62, 62);
		frame.getContentPane().add(bNegative);
		
		JButton bEquals = new JButton("=");
		bEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bEquals_actionPerformed(e);
			}
		});
		bEquals.setBounds(266, 426, 62, 62);
		frame.getContentPane().add(bEquals);
		
		textField = new JTextField();
		textField.setBounds(40, 24, 288, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
	
	private void bAC_actionPerformed(ActionEvent e) {
		
	}
	
	private void bSQRT_actionPerformed(ActionEvent e) {
		
	}
	
	private void bPerc_actionPerformed(ActionEvent e) {
		
	}
	
	private void bPlus_actionPerformed(ActionEvent e) {
		
	}
	

	private void bMinus_actionPerformed(ActionEvent e) {
		
	}
	
	private void bTimes_actionPerformed(ActionEvent e) {
		
	}
	
	private void bDivide_actionPerformed(ActionEvent e) {
		
	}
	
	private void bDot_actionPerformed(ActionEvent e) {
		
	}
	
	private void bNegative_actionPerformed(ActionEvent e) {
		
	}

	private void bEquals_actionPerformed(ActionEvent e) {
		
	}
	
	private void bZahl_actionPerformed(ActionEvent e, int zahl ) {
		
	}
	
}

