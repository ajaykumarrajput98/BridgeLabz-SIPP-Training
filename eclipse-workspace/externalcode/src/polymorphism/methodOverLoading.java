package polymorphism;
import java.util.Scanner;
public class methodOverLoading {
      /*1.same name of methods
	    2.same class and Data type should be same
	    3.but different arguments
	    4.it is also a compile time polymorphism*/
	
	public static void show(int n,String m) {
		System.out.println("this is my first show method ="+n+m);
		
	}
	public static void show(String m,int n) {
		System.out.println("this is my second show method");
	}
	void speach() {
		System.out.print("hii this is the last method is being executed by last method");
	}
	public static void main(String...args) {
		methodOverLoading aj=new methodOverLoading();
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter your number=");
		int n=scanner.nextInt();
		System.out.print("please enter your string =");
		String str=scanner.next();
		aj.show(n,"ajay");
		aj.speach();
	}
}
