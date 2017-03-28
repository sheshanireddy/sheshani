package test;

import test.Abstraction2;

public abstract class Abstraction {
	public void bike(){
		System.out.println("bikes have handle");
	}
	public void seat(){
		System.out.println("bikes have seats");
	}
	public abstract void engine();
	public abstract void wheels();
	
	public static void main(String[]args){
		Abstraction2 obj=new Abstraction2();
		obj.engine();
		obj.wheels();
		
		
	}
	
	

}



