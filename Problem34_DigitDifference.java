package levelprograms;
import java.util.*;
public class Problem34_DigitDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
        int num;

        if ((a / 10) % 10 > (b / 10) % 10)
            num = a;
        else
            num = b;

        int diff = Math.abs((num % 10) - (num / 100));
        
        System.out.println("The result is :"+diff);
	}
}
