package Inheritance;

public class Office_Details extends College_Details {
	public  void boy() {
		System.out.println("***Greens Institute****");
	super.boy();
	}
	
	public static void main(String[] args){
		//Classname refname=new classname();
		College_Details a=new Office_Details(); 
		a.boy();
		
		
	}
	}

