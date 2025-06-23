package day2;
import java.util.Scanner;
public class primeNumber {
	public static void main(String...args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your number =>");
		int number=scanner.nextInt();
		int i=1;int count=0;
		while(i<=number) {
			if(number%i==0) {
				count++;
				i++;
			}
		}
		if(count==2) {
			System.out.print("number is prime number ");
		}else {
			System.out.print("number is not prime number");
		}
	}

}
