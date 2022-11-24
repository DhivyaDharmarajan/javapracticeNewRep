package Armstrong;

import java.util.Scanner;

public class Armstrong_Num {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=s.nextInt();//153
	int remainder,result=0;
	int a=num;//copying original value
	
		while(a!=0) {
			
			remainder=a%10;
			result=result+(remainder*remainder*remainder);
			a=a/10;
			
	}
	
if(result==num) {
	System.out.println("Number is Armstrong");
	
}else {
	System.out.println("Number is Not Armstrong");
}



}
}