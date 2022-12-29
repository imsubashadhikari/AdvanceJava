package LayoutManagement;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;

	public GridLayoutDemo() {
		super("GridLayout Frame"); //calls constructor of JFrame //set Title //super must be first statement
		setSize(300,300);
//		setLayout layout = new setLayout();
		setLayout(new GridLayout(3,2,10,10 )); // 3 by 2 size of unit
//		hgap = 10-horizontally arranged components, vgap=10-vertically
		
		btn1 = new JButton("Button 1");
		add(btn1);
		btn2 = new JButton("Button 2");
		add(btn2);
		btn3 = new JButton("Button 3");
		add(btn3);
		btn4 = new JButton("Button 4");
		add(btn4);
		btn5 = new JButton("Button 5");
		add(btn5);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
		// TODO Auto-generated method stub

	}

}
