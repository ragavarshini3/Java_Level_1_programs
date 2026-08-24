package levelprograms;

import java.util.Scanner;

public class Problem16_reverse_lasttwodigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the four-digit number:");
		int num = sc.nextInt();
		
		int thousands = (num / 1000) % 100;
		int hundreds = (num / 100) % 10;
		int tens = (num / 10) % 10;
		int ones = num % 10;
		
		int ans = hundreds * 1000 + thousands *100 + tens *10+ ones;
		
		System.out.println("The output is:" + ans);
		
	}
}
