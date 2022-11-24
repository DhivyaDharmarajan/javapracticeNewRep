package swap1;

public class Swap_Num {
public static void main(String[] args) {
	int num1=70;
	int num2=8;
	System.out.println("BEFORE SWAP :"+num1+" "+num2);
	num1=num1-num2;
	num2=num1+num2;
	num1=num2-num1;
	System.out.println("AFTER SWAP :"+num1+" "+num2);
}
}
