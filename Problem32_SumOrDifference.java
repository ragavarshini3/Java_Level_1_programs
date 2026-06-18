package levelprograms;
import java.util.*;
public class Problem32_SumOrDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two 2-digit numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        
        if (sum>100) {
        	System.out.println("output:" + sum);
        }else {
        	System.out.println("Output: " + (sum - 100));
        }
	}
}
