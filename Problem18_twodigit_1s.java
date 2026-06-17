package levelprograms;
import java.util.*;
public class Problem18_twodigit_1s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two-digit number :");
		int num = sc.nextInt();
		int tens = 10 + (num % 10);
		System.out.println("The output is : " + tens);
		
	}
}
