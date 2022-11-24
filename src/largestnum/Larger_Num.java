package largestnum;

import java.util.Arrays;
import java.util.Scanner;

public class Larger_Num {
public static void main(String[] args) {
//	float large1 =7.8f;
//	double large2=-3.4d;
//	byte large3=127;
//	if (large1>=large2==large2>=large3) {
//		System.out.println(large1+" IS THE LARGEST NUMBER");
//	} else if (large2>large1==large3>=large2) 
//		System.out.println(large1 +" IS THE LARGEST NUMBER");	
//	    else 
//		System.out.println(large3+ " IS THE LARGEST NUMBER");
	
	//Ascending
	Scanner s=new Scanner(System.in);
	int n= s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
		Arrays.sort(arr);
	}
	System.out.println(Arrays.toString(arr));
	
}
}
