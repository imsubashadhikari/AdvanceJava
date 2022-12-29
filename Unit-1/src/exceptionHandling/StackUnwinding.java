package exceptionHandling;

import java.util.Scanner;

public class StackUnwinding {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Input numer if iteration");
			int it = input.nextInt();
			for (int i = 0; i < it; i++) {
				if (i == 5) {
					throw new Exception();
				}
				System.out.println(i);
			}
		} catch (RuntimeException ex) {
			System.err.println(ex);
		} finally {
			System.out.println("I always Execute");
			input.close(); //releasing resource input
		}
	}

}
