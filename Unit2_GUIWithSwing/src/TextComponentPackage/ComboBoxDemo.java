package TextComponentPackage;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

//Dropdown in web and combo box in desktop

public class ComboBoxDemo extends JFrame{
	JComboBox<String> cb;
	JLabel lbl;

	public ComboBoxDemo() {
		String country[] = {"Nepal", "India", "Pakistan"};
		cb = new JComboBox<String>(country);
		lbl = new JLabel();
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				lbl.setText(cb.getSelectedItem().toString());
			}			
		});
		
		cb.addItem("Argentina");
		setTitle("Combox");
		setLayout(new FlowLayout());
		setSize(300,300);
		add(cb);
		add(lbl);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new ComboBoxDemo();
		// TODO Auto-generated method stub

	}

}
