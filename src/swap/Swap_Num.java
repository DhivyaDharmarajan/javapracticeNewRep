package swap;

import java.util.Scanner;

public class Swap_Num {
public static void swap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("Before Swap :" + num1+"," +num2);
	int temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("After swap :" + num1 + ","+num2);
	
}
public static void main(String[] args) {
	swap();
}
}
