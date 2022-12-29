package choiceComponent;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame {
	JList<String>country;
	JLabel label;

	public JListDemo() {
		setTitle("JList Frame");
		setSize(300,300);
		setLayout(new GridLayout(0,1,10,10));
		String[] coun = {"Nepal", "China", "Bhutan", "Bangladesh"};
		country = new JList<String>(coun);
		label = new JLabel("Selected Countries");
		
		country.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				label.setText(country.getSelectedValuesList().toString());
			}
		});
		add(country);
		add(label);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new JListDemo();
		// TODO Auto-generated method stub

	}

}
