package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyConcept {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Input numer if iteration");
			int it=input.nextInt();
			for(int i =0; i <it; i++) {
				if(i == 5) {
					System.exit(0);;
				}
				System.out.println(i);
			}
		}
		catch(InputMismatchException ex) {
		System.err.println(ex);
		}
		finally {
			System.out.println("I always Execute");
		}
	}

}
