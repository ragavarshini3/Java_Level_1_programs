package levelprograms;
import java.util.*;
public class Problem9_Hundredsdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Three-Digit number : ");
		int s = sc.nextInt();
		
		int solution = s / 100;
		System.out.println("The output is " + solution);
	}
}
