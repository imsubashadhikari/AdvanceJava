
public class ObjectOrientedConcept {
	// declaring variables
	int a;
	float b;
	double c;

	// defining mathods
	void method1() {

	}
	int method2() {
		return 0;

	}
	void add(int a, int b) {
		
	}
	int mul(int b, int c) {
		return b*c;
		
	}

	public static void main(String[] args) {
		//object creation
		ObjectOrientedConcept ooc =new ObjectOrientedConcept();
		//ooc is an instance or object;
		//accessing variables or method
		ooc.a =24;
		ooc.b = 234.455f;
		ooc.c= 3453.3f;
		System.out.println(ooc.mul(3,4));

	}

}
