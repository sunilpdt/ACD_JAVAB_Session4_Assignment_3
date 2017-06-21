package com.acadgild;

public class FinalConstructorEx {

	final int count = 0;

	
	public FinalConstructorEx() {
		//The final field FinalConstructorEx.count cannot be assigned
		count++;
	}
	public static void main(String[] args) {
		
		FinalConstructorEx finalvarex=new FinalConstructorEx();
		

	}

}
