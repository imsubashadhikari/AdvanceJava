package InheritancePackage;

abstract class Car {
	final int wheels = 4; // impossible to overite or overide

	public Car() {
		System.out.println("Car Constructor");
	}

	public void VechicleType() {
		System.out.println("Type: Car");
	}
}

abstract class Maruti extends Car {// Sub Class
	public Maruti() {
		System.out.println("Maruti constructor");
	}

	public void brand() {
		System.out.println("Brand: Suzuki");
	}

	public void speed() {
		System.out.println("80km/hr");
	}
}

class Maruti800 extends Maruti {// sub class
	public Maruti800() {
		System.out.println("Maruti800 constructor");
	}

	@Override //annotation
	public void speed() {
		System.out.println("120km/hr");

	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Maruti800 car = new Maruti800();
		car.VechicleType();
		car.brand();
		car.speed();
		System.out.println("No. of wheels=" + car.wheels);
	}

}
