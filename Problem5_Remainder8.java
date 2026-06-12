package levelprograms;

import java.util.Scanner;

public class Problem5_Remainder8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be Divided : ");
		int s = sc.nextInt();
		int sol = s % 8;
		System.out.println("The output is : " + sol);
	}
}
