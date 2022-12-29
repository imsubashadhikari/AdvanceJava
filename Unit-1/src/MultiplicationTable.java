import java.util.Scanner;

public class MultiplicationTable {
	static int rows = 10;// fixed value, accessed in a class
	static int cols = 10;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows values");
		rows = input.nextInt();// user input from keyboard
		System.out.println("Enter columns values");
		cols = input.nextInt();// user input from keyboard
		MultiplicationTable obj = new MultiplicationTable();
		System.out.println("The multiplication table is:");
		int product[][] = new int[rows][cols];
		for (int i = 1; i < rows; i++) {
			System.out.println("Table of " + i + " is:");
			for (int j = 1; j < cols; j++) {
				product[i][j] = i * j;
				System.out.println(i + "*" + j + "=" + product[i][j] + "	");
			}
//			System.out.println("-------------");
		}
		// TODO Auto-generated method stub

	}

}
