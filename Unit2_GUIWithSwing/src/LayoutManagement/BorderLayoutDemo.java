package LayoutManagement;
//Border Layout is Default for JFrame

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	JButton btn0, btn1, btn2, btn3, btn4;
	
	public BorderLayoutDemo() {
		super("Border Layout Frame");
		
		String[] names = {"Button1","Button2", "Button3" , "Button4", "Button5"};
		JButton buttons[] = new JButton[names.length];
		for (int i = 0; i < names.length; i++) {
			buttons[i] = new JButton(names[i]);
		}

//		btn0 = new JButton("Button 1");
//		btn1 = new JButton("Button 2");
//		btn2 = new JButton("Button 3");
//		btn3 = new JButton("Button 4");
		
		add(btn0, BorderLayout.EAST);

		add(btn1, BorderLayout.SOUTH);

		add(btn2, BorderLayout.NORTH);

		add(btn3, BorderLayout.CENTER);
		add(btn4, BorderLayout.CENTER);

		
//		setLayout(new BorderLayout(10,10)); //hgap, vgap
		
//		add(new JButton("Button 5"),BorderLayout.WEST);
		setSize(400,400);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //terminate background running program also
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
		// TODO Auto-generated method stub

	}

}
