package day2;
import java.util.*;
public class calculator {
     public static void main(String...args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("please enter your first number =>");
    	 double X=sc.nextDouble();
    	 System.out.print("please enter your seceond number =>");
         double Y=sc.nextDouble();
         System.out.print("please enter your expression =>");
         String ch=sc.next();
         switch(ch){
        	 case "+":System.out.println(X+Y);
        	     break;
        	 case "-":System.out.println(X-Y);
        		 break;
        	 case "*":System.out.println(X*Y);
        		 break;
        	 case "/":System.out.println(X/Y);
        		 break;
             default:System.out.print("nothing to examine");
         }
		
	}
}
