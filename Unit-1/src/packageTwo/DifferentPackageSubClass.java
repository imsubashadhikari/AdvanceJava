package packageTwo;

import packageOne.ProtectionLevel;
//import packageOne.*;

public class DifferentPackageSubClass extends ProtectionLevel {
	public DifferentPackageSubClass() {
		// System.out.println("Defalut number="+num);
//		System.out.println("Private number="+p.numpri); 
		System.out.println("Protected number=" + numpro);
		System.out.println("Public number=" + numpub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
