//import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ConceptOfContainerAndComponent {
	JFrame frame; //object frame created in memory
	JButton button; //reference-no memory allocation
	JButton button2;
	public ConceptOfContainerAndComponent() {
		frame = new JFrame(); //container-main window
		button = new JButton("Click me"); //memory allocated-instantiation
		button2 = new JButton("Ma timro muni xu");
		frame.add(button); //component added to the container
		frame.add(button2);
		button2.setBounds(90,160,100,50);
		frame.setTitle("First Window");
		frame.setBounds(300,300,400,400);//shown 400,400 of screen position
		frame.setLayout(null); //no default Layout (Border layout)
		button.setBounds(90,100,100,50);// x-location,y-location,width, height of button
		frame.setSize(300,300);//width and height
		frame.setVisible(true);	// showing frame above screen
	}

	public static void main(String[] args) {
		new ConceptOfContainerAndComponent(); //constructor called
		// TODO Auto-generated method stub

	}

}
