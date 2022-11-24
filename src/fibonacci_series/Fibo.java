package fibonacci_series;

import java.util.Iterator;
import java.util.Scanner;

public class Fibo {
public static void main(String[] args) {
//	System.out.println("\t\t\tFibbonacci Series");
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter number:");
//	int n=s.nextInt();
//	int firstterm=0;
//	int secondterm=1;
//	int nextterm;
//	int arr[]=new int[n];
//	for (int i = 0; i <=n; i++) {
//		arr[i]=s.nextInt();
//		nextterm=firstterm+secondterm;
//		firstterm=secondterm;
//		secondterm=nextterm;
//		System.out.println(nextterm);
//	}
System.out.println("Enter a number");
Scanner s= new Scanner(System.in);
int num=s.nextInt();//original number=370
int remainder,result=0;
int a=num;//copying the original number
while(a!=0) {//370//37//3
	remainder=a%10;//370/10=~~~~~%0;===37%10=~~~7====~~~3
	result=result+(remainder*remainder*remainder);//0+(0);~~~0~~~0+(7*7*7)=~~343===343+(3*3*3)=370
	a=a/10;//370/10=~~~~37~~3====3/10=0
}
if(result==num) {
	System.out.println("ArmStrong");
}else {
	System.out.println("Not Armstrong");

}

	
}
}
