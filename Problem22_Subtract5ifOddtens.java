package levelprograms;
import java.util.*;
public class Problem22_Subtract5ifOddtens {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");
	int num = sc.nextInt();
	
	
	int tens = (num % 100) / 10 ;
	
	
	int result = (tens % 2 !=0 ) ? (num -5) : num ;
	
	System.out.println("Result:" + result);
	}
}