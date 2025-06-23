package day2;
import java.util.*;
public class findTheSumOfNUmbers {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter your number =>");
		int number=sc.nextInt();
		System.out.print(sumofvalues(number));
		
	}
	public static int sumofvalues(int number) {
		int count =0;int i=0;
		while(i<=number) {
			count+=i;
			i++;
		}
		return count;
	}

}
