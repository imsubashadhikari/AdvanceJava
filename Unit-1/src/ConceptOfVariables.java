
public class ConceptOfVariables {
	// 1. instance variables or non-static variables
	// INSTANCE VARIABLE
	// The variables that requires object or instance to be accessed.
	int num;

	// STATIC or CLASS VARIABLES
	static int num1 = 30;

	// 2. Instance menthod ra non static men=thod
	void method() {
		
	}
	static void method2() {
		
	}
	public static void main(String[] args) {
		ConceptOfVariables obj = new ConceptOfVariables();// instance 0r object
		System.out.println("The number is" + obj.num);// needed obj for instance variable
		obj.method();//non-static method
		method2();//static method
		System.out.println("The number1 is" + num1);// object not needed to access
	}

}
