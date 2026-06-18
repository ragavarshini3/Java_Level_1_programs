package levelprograms;
import java.util.Scanner;

public class Problem33_BiggestNumberDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two 2-digit numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int biggest;

        if (a > b) {
            biggest = a;
        } else {
            biggest = b;
        }

        int sum = (biggest / 10) + (biggest % 10);

        System.out.println("Output: " + sum);

        sc.close();
    }
}