package levelprograms;
import java.util.*;

public class Problem11_Sumof2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int tens = num / 10;
        int ones = num % 10;

        int sum = tens + ones;

        System.out.println("Sum of digits = " + sum);
        }
}