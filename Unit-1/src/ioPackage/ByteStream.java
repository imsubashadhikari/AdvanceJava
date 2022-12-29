package ioPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	FileInputStream input = null;
	FileOutputStream output = null;

	public ByteStream() throws IOException {
		input = new FileInputStream("D:\\Javafiles\\input.txt");// read
		output = new FileOutputStream("D:\\Javafiles\\output.txt");// write
		int ch;
		while ((ch = input.read()) != -1) {// -1 is end of file
			output.write(ch);
		}
	}

	public static void main(String[] args) throws IOException {
		new ByteStream();
	}

}
