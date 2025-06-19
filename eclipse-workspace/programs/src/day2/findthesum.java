package day2;
import java.util.*;
public class findthesum {
	public static void main(String...arga) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your number");
		int number=scanner.nextInt();
		System.out.println(sumForValues(number));
	}
	public static int sumForValues(int number) {
		int i=1,count=0;
		while(i<=number) {
			count++;
			number--;
		}
		return count;
	}

}
