package levelprograms;
import java.util.*;
public class Problem14_Threedigit_Reverse {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three-digit number:");
		int num = sc.nextInt();
		int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;
        
        int sol = ones * 100 + tens*10 + hundreds;
        System.out.println("The output is :" + sol);
	}
}