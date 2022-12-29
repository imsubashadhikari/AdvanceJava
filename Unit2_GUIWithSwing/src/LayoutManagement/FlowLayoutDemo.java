package LayoutManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame{
	JButton btn1, btn2, btn3, btn4;
	public FlowLayoutDemo() {
		super("FlowLayout Frame"); //calls constructor of JFrame //set Title //super must be first statement
		setSize(500,300);
	//	FlowLayout layout = new FlowLayout();
		setLayout(new FlowLayout(FlowLayout.LEFT, 20,20)); //LEFT Allignment
//		hgap = 10-horizontally arranged components, vgap=10-vertically
		
		btn1 = new JButton("Button 1");
		add(btn1);
		btn2 = new JButton("Button 2");
		add(btn2);
		btn3 = new JButton("Button 3");
		add(btn3);
		btn4 = new JButton("Button 4");
		add(btn4);
		
		
		setVisible(true);
	}
	//FlowLayout Default Layout for JPanel

	public static void main(String[] args) {
		new FlowLayoutDemo();
		// TODO Auto-generated method stub

	}

}
