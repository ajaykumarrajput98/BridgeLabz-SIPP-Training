package day2;
import java.util.Scanner;
public class countTheInteger {
       public static void main(String...args) {
    	   Scanner scanner=new Scanner(System.in);
    	   System.out.print("please enter your number =>");
    	   int number=scanner.nextInt();
    	   int count=0;
    	   while(0<number) {
    		   count++;
    		   number=number/10;
    		   
    	   }
    		   System.out.print("total number element in given number is =>"+count);
    	   
       }
}
