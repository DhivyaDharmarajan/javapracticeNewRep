package add;

import java.util.Scanner;

public class Add {
public static void addMethod() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=s.nextInt();
	int b=s.nextInt();
	int sum=a+b;
	System.out.println("Final Result :"+sum);
}

public static void main(String[] args) {
	
//		System.out.println('R'+'e'+'l'+'e'+'v'+'e'+'l');
	addMethod();
	
}
	
}	

