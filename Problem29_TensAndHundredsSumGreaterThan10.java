package levelprograms;

import java.util.*;

public class Problem29_TensAndHundredsSumGreaterThan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int hundreds = (num / 100) % 10;
        int tens = (num / 10) % 10;

        int sum = hundreds + tens;

        System.out.println((sum > 10) ? "Success" : "Failure");
    }
}