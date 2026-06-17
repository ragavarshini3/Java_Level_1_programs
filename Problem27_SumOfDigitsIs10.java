package levelprograms;
import java.util.Scanner;

public class Problem27_SumOfDigitsIs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        int sum = hundreds + tens + ones;

        System.out.println((sum == 10) ? "Success" : "Failure");
    }
}