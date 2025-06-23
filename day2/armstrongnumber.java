package day2;
import java.util.Scanner;
public class armstrongnumber {
	public static void main(String...args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your input =>");
		int number=scanner.nextInt();
		int n=number;
		int arm=0;
		while(0<number) {
			int rem=number%10;
			arm=arm+(rem*rem*rem);
			number/=10;
		}
		if(arm==n) {
			System.out.print("your number is a armstrong number");
			
		}else{
			System.out.print("not a armstrong number");
		}
	}

}
