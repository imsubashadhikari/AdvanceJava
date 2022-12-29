import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameAndJPanel extends JFrame {
	JPanel panel1, panel2,panel3, panel4; // references
	JButton button1, button2;

	public JFrameAndJPanel() {
		setLayout(null);
		panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		panel1.setLayout(null);
		panel1.setBounds(30, 20, 80, 50);
		button1 = new JButton("P1");
		button1.setLayout(null);
		button1.setBounds(5, 10, 45, 40);
		button1.setBackground(Color.PINK);
		panel1.add(button1);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.RED);
		panel2.setBounds(30, 80, 80, 50);
		button2 = new JButton("P2");
		button2.setLayout(null);
		button2.setBounds(5, 10, 45, 40);
		button2.setBackground(Color.YELLOW);
		panel2.add(button2);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.YELLOW);
		panel3.setBounds(120, 80, 80, 50);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(Color.GREEN);
		panel4.setBounds(120, 20, 80, 50);
		
		add(panel1);
		add(panel2);// added to JFrame
		add(panel3);
		add(panel4);
		setTitle("Frame title");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameAndJPanel(); //JFrame is created in memory
		// TODO Auto-generated method stub

	}

}
