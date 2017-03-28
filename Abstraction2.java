package test;


public class Abstraction2 extends Abstraction {

	@Override
	public void engine() {
		System.out.println("bikes have engine");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wheels() {
		System.out.println("bikes have wheels");
	}
		public static void main(String[]args) {
			Abstraction2 obj2=new Abstraction2();
			obj2.engine();
			obj2.seat();
			obj2.bike();
			
		}
	}
	


