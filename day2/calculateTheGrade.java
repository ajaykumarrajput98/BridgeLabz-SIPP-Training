package day2;
import java.util.*;
public class calculateTheGrade {
       public static void main(String...args) {
    	   Scanner scanner=new Scanner(System.in);
    	   System.out.print("please enter your physics's number =>");
    	   int PN=scanner.nextInt();
    	   System.out.print("please enter your chemistry's number =>");
    	   int CN=scanner.nextInt();
    	   System.out.print("please enter your math's number =>");
    	   int MN=scanner.nextInt();
    	   int total_obtained=PN+CN+MN;
    	   int percentage=(total_obtained/300)*100;
          gradeOfNumbers(percentage);
       }
       public static void gradeOfNumbers(int percentage) {
    	   if(percentage>=80) {
    		   System.out.print("grade:A");
    	   }else if(79>=percentage &&percentage<=70) {
    		   System.out.print("grade:B");
    	   }else if(percentage>=69 &&percentage<=60) {
    		   System.out.print("grade:C");
    	   }else if(percentage>=59 &&percentage<=50) {
    		   System.out.print("grade:D");
    	   }else if(percentage>=49&&percentage<=40) {
    		   System.out.print("grade:E");
    	   }else {
    		   System.out.print("FAIL");
    	   }
       }
      
}
