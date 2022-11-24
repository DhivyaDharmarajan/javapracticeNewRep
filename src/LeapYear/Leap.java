package LeapYear;

import java.util.Scanner;

public class Leap {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Start year");
	int startyear=s.nextInt();
	System.out.println("Enter End year");
	int Endyear=s.nextInt();
	
	for(int i=startyear;i<=Endyear;i++) {
		if(i%4==0&&i%100!=0||i%400==0) {
		System.out.println("Leap Year :"+i);
		
		
		}else {
			
			System.out.println("Not a Leap Year :"+i);
		}
		}
	}
}

