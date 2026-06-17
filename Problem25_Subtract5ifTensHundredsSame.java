package levelprograms;
import java.util.*;
public class Problem25_Subtract5ifTensHundredsSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 4 digit number:");
        int num = sc.nextInt();

        int hundreds = (num / 100) % 10;
        int tens = (num / 10) % 10;

        int result = num - ((hundreds == tens) ? 5 : 0);

        System.out.println(result);
    }
}