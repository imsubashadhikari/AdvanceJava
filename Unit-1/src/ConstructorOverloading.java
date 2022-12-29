
class Shapes {
	private int length, breadth;
	float radius;

	// Method Overloading--> changing function parameters and using it with same
	// name
	public Shapes(int length) {
		this.length = this.breadth = length;
	}

	public Shapes(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(float radius) {
		this.radius = radius;
	}

	public int area() {
		return length * breadth;
	}

	public float areaC() {
		return (float) Math.PI * radius * radius;// explicit typecasting
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Shapes rect = new Shapes(5, 5);// calls constructor(with 1 parameter)
		System.out.println("Area of rectangle:" + rect.area());
		Shapes square = new Shapes(5);
		System.out.println("Area of Square" + square.area());
		Shapes circle = new Shapes(23.45f);
		System.out.println("Area of circle:" + circle.areaC());

	}

}
