package levelprograms;
import java.util.*;
public class Problem26_SumOfDigitsIs10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int num = sc.nextInt();
	
	int sum = (num / 10) + (num % 10);

    System.out.println((sum == 10) ? "Success" : "Failure");
    }
}