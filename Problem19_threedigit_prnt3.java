package levelprograms;

import java.util.Scanner;

public class Problem19_threedigit_prnt3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int result = (num / 10) * 10 + 2;

        System.out.println("The output number is : " + result);
    }
}