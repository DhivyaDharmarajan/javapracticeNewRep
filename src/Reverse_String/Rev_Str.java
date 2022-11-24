package Reverse_String;

import java.util.Iterator;
import java.util.Scanner;

public class Rev_Str {
public static void characterstring() {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name=s.nextLine();
		for(int i=name.length()-1;i>=0;i--){
		char ch=name.charAt(i);
		System.out.println(ch);

		}
		
}
public static void splitstring(){
	System.out.print("Enter the String:");
Scanner s=new Scanner(System.in);

String name=s.nextLine();
String res="";
String[] sp=name.split(" ");
for(int i=sp.length-1;i>=0;i--){
res=res+sp[i]+" ";
}
System.out.println(res);
}
public static void main(String[] args) {
	characterstring();
	splitstring();
}


}

