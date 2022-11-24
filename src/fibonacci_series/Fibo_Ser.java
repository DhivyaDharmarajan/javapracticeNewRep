package fibonacci_series;

import java.util.Scanner;

public class Fibo_Ser {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Fibonacci Series:");
		int num = s.nextInt();

		int firstnum = 0, secondnum = 1, nextnum;
		
		for (int i = 0; i < num; i++) {
			System.out.println(firstnum);
			nextnum = firstnum + secondnum; // swap
			firstnum = secondnum;
			secondnum = nextnum;
			
 
		}
	}
}
