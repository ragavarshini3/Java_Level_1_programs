package levelprograms;
import java.util.*;
public class Problem24_Subtract5ifFirstLastSame {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		int hundreds = num / 100;
		int ones = num % 10;
		
        int result = num - ((hundreds == ones) ? 5 :0);
        System.out.println("The result is :" + result);
	}
}
