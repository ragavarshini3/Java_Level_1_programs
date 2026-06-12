package levelprograms;
import java.util.*;

public class Problem8_Threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num1 = sc.nextInt();

        int sol = num1 % 10;

        System.out.println("The one's digit is " + sol);

    }
}