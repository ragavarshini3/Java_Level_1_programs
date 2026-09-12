package levelprograms;
import java.util.*;
public class Problem10_threedigit_tensplace {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
		int s = sc.nextInt();
		int sol = s / 10;
		int ans = sol % 10;
		System.out.println("The output is : " + ans);
	}
}
