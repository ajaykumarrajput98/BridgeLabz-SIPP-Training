package day2;
import java.util.Scanner;
public class toCheckDivisibleBy {
public static void main(String...args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("please enter your number =>");
	int number=scanner.nextInt();
	divisible(number);
	
}
 public static void divisible(int number) {
	 if(number%5==0) {
		 System.out.println("number is divisible by 5 =>");
	 }
	 else {
		 System.out.println("no number isn't divisible by 5 =>");
	 }
 }
}
