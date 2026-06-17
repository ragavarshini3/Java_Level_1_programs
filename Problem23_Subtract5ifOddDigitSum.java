package levelprograms;
import java.util.*;
public class Problem23_Subtract5ifOddDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		int digitsum = (num / 10) + (num % 10 );
		
        int result = num - 5 * (digitsum % 2);
        System.out.println("Result : " + result );
	}
}
