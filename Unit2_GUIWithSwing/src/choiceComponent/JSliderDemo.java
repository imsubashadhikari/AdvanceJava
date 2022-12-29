package choiceComponent;

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame{
	JSlider slider;
	ChangeListener listener;
	JTextField valuetxt;
	

	public JSliderDemo() {
		setTitle("Slider Frame");
		setSize(400,400);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		valuetxt = new JTextField(20);
		listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				valuetxt.setText(String.valueOf(source.getValue()));
			}
		};
		slider = new JSlider(SwingConstants.HORIZONTAL,0,100,50);

		Hashtable<Integer, Component> labeltbl = 
				new Hashtable<Integer, Component>();
		labeltbl.put(0,new JLabel("A"));
		labeltbl.put(20,new JLabel("B"));
		labeltbl.put(40,new JLabel("C"));
		labeltbl.put(60,new JLabel("D"));
		labeltbl.put(80,new JLabel("E"));
		labeltbl.put(100,new JLabel("F"));
		slider.setLabelTable(labeltbl);

		
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		//slider.setInverted(true);
		slider.addChangeListener(listener);
		add(slider);
		add(valuetxt);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new JSliderDemo();
		// TODO Auto-generated method stub

	}

}
