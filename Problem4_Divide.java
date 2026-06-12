package levelprograms;

import java.util.Scanner;

public class Problem4_Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be Divided:");
		int a = sc.nextInt();
		int solution = a/6;
		System.out.println("The output is : " + solution);
	}
}
