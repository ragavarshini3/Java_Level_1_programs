package levelprograms;
import java.util.*;
public class Problem15_Fourdigit_twoswap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the four-digit number:");
		int num = sc.nextInt();
		
		int thousands = num / 1000;
		int hundreds = (num / 100) % 10;
		int tens = (num / 10) % 10;
		int ones = num % 10;
		
        int ans = thousands * 1000 + hundreds * 100 + ones * 10 + tens;
		System.out.println("The output is:" + ans);
		
	}
}
