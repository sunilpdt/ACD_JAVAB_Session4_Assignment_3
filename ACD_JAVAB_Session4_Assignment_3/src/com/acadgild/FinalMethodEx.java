package com.acadgild;

public class FinalMethodEx {
	
	public final void testCode(){
		System.out.println("This is a final method");
	}
	

	public static void main(String[] args) {
		FinalMethodEx finalChild=new FinalMethodChild();
		
		finalChild.testCode();

	}

}

class FinalMethodChild extends FinalMethodEx{
	
	public void testCode(){
		//Cannot override the final method from FinalMethodEx
		System.out.println("THis is the overriding method");
	}
}
