package ioPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	FileReader in = null;
	FileWriter out = null;

	public CharacterStream() throws IOException {
		try {
			in = new FileReader("D:\\Javafiles\\input.txt");
			out = new FileWriter("D:\\Javafiles\\output1.txt");// write
			int ch;
			while ((ch = in.read()) != -1) {// -1 is end of file
				out.write(ch);
			}
		} catch (IOException e) {

		} // read
		finally {
			in.close();
			out.close();

	}

	}

	public static void main(String[] args) throws IOException {
		new CharacterStream();
	}

}
