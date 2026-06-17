package levelprograms;
import java.util.*;
public class Problem17_twodigit_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Two-digit numbers : ");
		int num = sc.nextInt();
		int tens = num / 10;
		int ans = tens * 10;
		System.out.println("The output is : " + ans);
		
	}
}
