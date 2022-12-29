package InheritancePackage; //user defined
abstract class Employee{ //base /parent /super class  //no need obj to access abstract class
	int id;
	String name;
	float salary;
}
class Developers  extends Employee{ //derived /child /sub class
	float bonus;
	void display() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Total Salary = "+(salary+bonus));
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Developers emp = new Developers();
		emp.id = 1011;
		emp.name ="Subash";
		emp.bonus = 30000.0045f;
		emp.salary = 50000;
		emp.display();
	}

}
