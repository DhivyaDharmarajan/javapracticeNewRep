package calc;

import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER TWO NUMBERS:");
	double n=s.nextDouble();
	double n1=s.nextDouble();
	System.out.println("ENTER AN OPERATOR: *,/,+,-");
	char c=s.next().charAt(0);
	double result;
	switch(c)
	{
	case '+':
		result=n+n1;
		System.out.println(n+n1);
	break;
	case '-' :
		result=n-n1;
		System.out.println(n-n1);
	break;
	case '*' :
		result=n*n1;
		System.out.println(n*n1);
	break;
	case '/' :
		result=n/n1;
		System.out.println(n/n1);
	break;
	default:
		System.out.println("ERROR");
		break;
		
	}
	
	
}
}
