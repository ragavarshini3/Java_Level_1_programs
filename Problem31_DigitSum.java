package levelprograms;
import java.util.*;

public class Problem31_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int s = sc.nextInt();
        int sum = 0;

        while (s > 0 || sum > 9) {
            if (s == 0) {
                s = sum;
                sum = 0;
            }

            sum += s % 10;
            s /= 10;
        }

        System.out.println("THE RESULT IS: " + sum);
        sc.close();
    }
}