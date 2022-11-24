package EvenorOdd;

import java.util.Scanner;

public class Even_odd {
public static void main(String[] args) {
	Scanner evencheck=new Scanner(System.in);
	System.out.println("Enter the number  : ");
	int input=evencheck.nextInt();
	if (input%2==0) {
		System.out.println(" THE NUMBER "+input+ " IS EVEN ");
	} else {
		System.out.println(" THE NUMBER "+input +" IS ODD ");
	}
		
}
}
