package levelprograms;
import java.util.*;

public class Problem12_threedigit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        int sum = hundreds + tens + ones;

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}