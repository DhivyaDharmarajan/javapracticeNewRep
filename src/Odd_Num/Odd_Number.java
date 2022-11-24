package Odd_Num;

import java.util.Iterator;
import java.util.Scanner;

public class Odd_Number {
	public static void main(String[] args) {

		  
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter no. of elements in array:");
	        int n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i <=n-1; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("Odd numbers:");
	        for(int i = 0 ; i <=n-1 ; i++)
	        {
	            if(a[i] % 2 != 0)
	            {
	                System.out.println(a[i]+" "+"IS AN ODD NUMBER ");
	            }else {
	            	System.out.println(a[i]+" " +"IS AN EVEN NUMBER ");
	            }
	        }

	        
	}
	        
}