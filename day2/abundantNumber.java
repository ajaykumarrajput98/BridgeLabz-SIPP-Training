package day2;
import java.util.Scanner;
public class abundantNumber {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter your number =>");
		int number=sc.nextInt();
		int i=1;int count=0;
		while(i<number) {
			if(number%i==0) {
				count=count+i;
			}
			i++;
		}
		if(count>number) {
			System.out.print("number is abundant number =>");
		}else {
			System.out.print("no number is not abundant number =>");
		}
	}

}
