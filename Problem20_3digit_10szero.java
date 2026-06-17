package levelprograms;

import java.util.Scanner;

public class Problem20_3digit_10szero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int result = (num / 100) * 100 + (num % 10);

        System.out.println("Number after making ten's digit 0: " + result);
    }
}