package com.acadgild;



final class XYZ{  
}  

//The type FinalClassEx cannot subclass the final class XYZ
class FinalClassEx extends XYZ{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
	   FinalClassEx obj= new FinalClassEx(); 
      obj.demo();
   }  
}

