package day2;
import java.util.Scanner;
public class harshadnumber {
	public static void main(String...args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your number =>");
		int number=scanner.nextInt();
		int n=number;
		while(0<number) {
			int rem=number%10;
			sum+=rem;
			number=number/10;
		}
		if(n%sum==0) {
			System.out.print("number is harshad number");
		}
		else {
			System.out.print("not a harshad number");
		}
	}
}
