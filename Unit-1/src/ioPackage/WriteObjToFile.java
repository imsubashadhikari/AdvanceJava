package ioPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjToFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		
		Student s1 = new Student(1, " Subash", 24);
		Student s2 = new Student(2, "Dhiraj", 22);
		File file = new File("D:\\Javafiles\\objectfile.txt");
		try {
			fo = new FileOutputStream(file);
			oo = new ObjectOutputStream(fo);
			oo.writeObject(s1);
			oo.writeObject(s2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		} finally {
			fo.close();
			oo.close();
		}
	}

}
