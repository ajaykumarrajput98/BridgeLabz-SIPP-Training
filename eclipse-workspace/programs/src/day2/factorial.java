package day2;
import java.util.Scanner;
public class factorial {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your facto number =>");
		int number =sc.nextInt();
		System.out.println(factorialofnumber(number));
	}
	public static int factorialofnumber(int number) {
		int fact=1;
		int i=1;
		while(i<=number) {
			fact=fact*number;
			number--;
		}
		return fact;
	}

}
