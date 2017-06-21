package com.acadgild;

public class FinalVariableEx {

	final int count = 0;

	public void FinalVariableExample() {
		count++; //The final field FinalVariableExample.count cannot be assigned
	}
	public static void main(String[] args) {
		
		FinalVariableEx finalvarex=new FinalVariableEx();
		finalvarex.FinalVariableExample();

	}

}
