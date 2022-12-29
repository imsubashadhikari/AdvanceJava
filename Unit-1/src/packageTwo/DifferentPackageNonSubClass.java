package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageNonSubClass {

	public DifferentPackageNonSubClass() {
		ProtectionLevel p = new ProtectionLevel();
//		System.out.println("Defalut number=" + p.num);
//		System.out.println("Private number=" + p.numpri);
//		System.out.println("Protected number=" + p.numpro);
		System.out.println("Public number=" + p.numpub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
