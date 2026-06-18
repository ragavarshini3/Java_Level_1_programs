package levelprograms;

import java.util.*;

public class Problem30_SumEquals10AndOneDigitGreaterThan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int hundreds = (num / 100) % 10;
        int tens = (num / 10) % 10;

        System.out.println((hundreds + tens == 10 && (hundreds > 7 || tens > 7))
                ? "Success"
                : "Failure");

        sc.close();
    }
}