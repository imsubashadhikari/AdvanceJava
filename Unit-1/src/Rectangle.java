
public class Rectangle {
	int length, breadth;// instance variables

	void getPrameters(int length, int breadth) { //method-non return
		this.length = length; //instance variable initialize
		this.breadth = breadth;//instance variable initialize
	}
	int getArea() {//method return type
		return length * breadth;	
	}


	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();//object of rectangle
//		Rectangle rec2 = new Rectangle();
		//initializing instance variable
		rec1.length =5 ;
		rec1.breadth = 6;
		System.out.println(rec1.getArea());
		
		//using method
		rec1.getPrameters(3, 4);
		System.out.println(rec1.getArea());
	}

}
