package levelprograms;

import java.util.*;

public class Problem7_Tensdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Two-digit number :");
		int s = sc.nextInt();
		
		int sol = s / 10;
		System.out.println("The output is : " + sol);
	}
}
