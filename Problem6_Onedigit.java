package levelprograms;

import java.util.Scanner;

public class Problem6_Onedigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the One-digit number :");
		int s = sc.nextInt();
		
		int sol = s % 10;
		System.out.println("The output is : " + sol);
	}
}
