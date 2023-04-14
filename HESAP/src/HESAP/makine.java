package HESAP;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.SwingConstants;
public class makine extends JFrame{
	private JTextField textField;
	private JButton btnNewButtonBackSpace;
	float a=0,b=0,c=1,d=1,f=1;
	boolean eq=false;
	String op = "";
	public makine() {
		setResizable(false);
		setMinimumSize(new Dimension(314, 444));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(314, 400));
		getContentPane().setLayout(null);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton7.getText();
				textField.setText(text);
			}
		});
		btnNewButton7.setBounds(10, 121, 60, 60);
		getContentPane().add(btnNewButton7);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 11, 268, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton8.getText();
				textField.setText(text);
			}
		});
		btnNewButton8.setBounds(80, 121, 60, 60);
		getContentPane().add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton9.getText();
				textField.setText(text);
			}
		});
		btnNewButton9.setBounds(150, 121, 60, 60);
		getContentPane().add(btnNewButton9);
		
		JButton btnNewButtonPlus = new JButton("+");
		btnNewButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(textField.getText());
				textField.setText(null);
				op="+";
			}
		});
		btnNewButtonPlus.setBounds(218, 54, 60, 60);
		getContentPane().add(btnNewButtonPlus);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton4.getText();
				textField.setText(text);
			}
		});
		btnNewButton4.setBounds(10, 192, 60, 60);
		getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton5.getText();
				textField.setText(text);
			}
		});
		btnNewButton5.setBounds(80, 192, 60, 60);
		getContentPane().add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton6.getText();
				textField.setText(text);
			}
		});
		btnNewButton6.setBounds(150, 192, 60, 60);
		getContentPane().add(btnNewButton6);
		
		JButton btnNewButtonMinus = new JButton("-");
		btnNewButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Float.parseFloat(textField.getText());
				textField.setText(null);
				op="-";
			}
		});
		btnNewButtonMinus.setBounds(220, 121, 60, 60);
		getContentPane().add(btnNewButtonMinus);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton1.getText();
				textField.setText(text);
			}
		});
		btnNewButton1.setBounds(10, 258, 60, 60);
		getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton2.getText();
				textField.setText(text);
			}
		});
		btnNewButton2.setBounds(80, 258, 60, 60);
		getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton3.getText();
				textField.setText(text);
			}
		});
		btnNewButton3.setBounds(150, 258, 60, 60);
		getContentPane().add(btnNewButton3);
		
		JButton btnNewButtonMultp = new JButton("*");
		btnNewButtonMultp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Float.parseFloat(textField.getText());
				textField.setText(null);
				op = "*";
			}
		});
		btnNewButtonMultp.setBounds(218, 192, 60, 60);
		getContentPane().add(btnNewButtonMultp);
		
		JButton btnNewButtonEquals = new JButton("=");
		btnNewButtonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float g = Float.parseFloat(textField.getText());
				switch(op) {
				case "+":
					g = a+g;
					break;
				case "-":
					g = (b-g);
				case "*":
					g = c*g;
					break;
				case "/":
					g = d/g;
					break;	
				}
				textField.setText(Float.toString(g));
				eq = true;
			}
		});
		btnNewButtonEquals.setBounds(218, 329, 60, 60);
		getContentPane().add(btnNewButtonEquals);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+btnNewButton0.getText();
				textField.setText(text);
			}
		});
		btnNewButton0.setBounds(80, 329, 60, 60);
		getContentPane().add(btnNewButton0);
		
		JButton btnNewButtonDot = new JButton(".");
		btnNewButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText()+".";
				textField.setText(text);
			}
		});
		btnNewButtonDot.setBounds(150, 329, 60, 60);
		getContentPane().add(btnNewButtonDot);
		
		JButton btnNewButtonDiv = new JButton("/");
		btnNewButtonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d=Float.parseFloat(textField.getText());
				textField.setText(null);
				op="/";
			}
		});
		btnNewButtonDiv.setBounds(218, 258, 60, 60);
		getContentPane().add(btnNewButtonDiv);
		
		JButton btnNewButtonCE = new JButton("CE");
		btnNewButtonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				a=0;
				b=0;
				c=1;
				d=1;
				f=1;
				eq=false;
			}
		});
		btnNewButtonCE.setBounds(10, 54, 60, 60);
		getContentPane().add(btnNewButtonCE);
		
		btnNewButtonBackSpace = new JButton("←");
		btnNewButtonBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!eq) {
					String old = textField.getText();
				String a = old.substring(0, old.length()-1);
				textField.setText(a);
				}
			}
		});
		btnNewButtonBackSpace.setBounds(80, 54, 60, 60);
		getContentPane().add(btnNewButtonBackSpace);
		
		JButton btnNewButtonPercent = new JButton("%");
		btnNewButtonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=Integer.parseInt(textField.getText());
				textField.setText(null);
				op="%";
			}
		});
		btnNewButtonPercent.setBounds(150, 54, 60, 60);
		getContentPane().add(btnNewButtonPercent);
		
		JButton btnNewButton7_4 = new JButton("±");
		btnNewButton7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float replace = Float.parseFloat(textField.getText());
				replace = -replace;
				textField.setText(replace.toString());
			}
		});
		btnNewButton7_4.setBounds(10, 329, 60, 60);
		getContentPane().add(btnNewButton7_4);
	}
	public static void main(String[] args) {
		makine calc = new makine();
		calc.setVisible(true);
	}

}

