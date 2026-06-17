package levelprograms;

import java.util.Scanner;

public class Problem21_Subtract5IfOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num - (num % 2) * 5;

        System.out.println("Result: " + result);
    }
}