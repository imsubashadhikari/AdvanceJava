package LayoutManagement;

import javax.swing.*; //import all classes from java


public class NoLayoutDemo extends JFrame{
	JLabel reg, fnlbl, lnlbl, emaillbl, aboutlbl;
	
	public NoLayoutDemo() {
		super("No Layout");
		setLayout(null);
		//JLabels
		setSize(300,400);
		JTextField fntxt, lntxt, emailtxt;
		JTextArea abouttxt;
		JButton submit;
		
		
		reg = new JLabel("Registration Form");
		reg.setBounds(50,10,200,20);
		add(reg); //added at 50,20 position if JFrame
		
		fnlbl = new JLabel("First Name");
		fnlbl.setBounds(10,40,100,20);
		add(fnlbl);
		
		lnlbl = new JLabel("Last Name");
		lnlbl.setBounds(10,80,100,20);
		add(lnlbl);
		
		emaillbl = new JLabel("Email");
		emaillbl.setBounds(10,120,100,20);
		add(emaillbl);
		
		aboutlbl =new JLabel("About");
		aboutlbl.setBounds(10,160,100,20);
		add(aboutlbl);
		
		//JTextFields
		fntxt = new JTextField(20);
		fntxt.setBounds(120,40,100,20);
		add(fntxt);
		
		lntxt = new JTextField(20);
		lntxt.setBounds(120,80,100,20);
		add(lntxt);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(120,120,100,20);
		add(emailtxt);
		
		//JTextArea
		abouttxt = new JTextArea("Write something about yourslef",5,20);
		JScrollPane pane = new JScrollPane(abouttxt);
		pane.setBounds(120,160,100,100);
		add(pane);
		
		//JFrame Configuration
		submit = new JButton("Submit");
		submit.setBounds(80,300,100,20);
		add(submit);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args) {
		new NoLayoutDemo();
		// TODO Auto-generated method stub

	}

}