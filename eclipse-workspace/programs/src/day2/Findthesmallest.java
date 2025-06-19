package day2;
import java.util.*;
public class Findthesmallest {
	public static void main(String...args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("please enter your number");
			int A=scanner.nextInt();
			System.out.println("please enter your number");
			int B=scanner.nextInt();
			System.out.println("please enter your number");
			int C=scanner.nextInt();
			System.out.println(smallest(A,B,C));
		}
	}
	public static int smallest(int X,int Y,int Z) {
		if(X>Y) {
			return Y;
		}
		else if(Y>Z) {
			return Z;
		}
		return X;
	}

}
