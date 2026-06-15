package levelprograms;
import java.util.*;
public class Probem13_twodigit_reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Two-Digit number:");
		int s = sc.nextInt();
		int tens = s /10;
		int ones = s %10;
        int sol = ones * 10 + tens;

		System.out.println("The output is : " + sol);
	}
}
