package oops;

public class Runtimepolymorphisam3 extends Runtimepolymorphisam {
	public static void main(String args[]){  
		Runtimepolymorphisam b;  
		b=new Runtimepolymorphisam1();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new Runtimepolymorphisam2();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new Runtimepolymorphisam3();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		}  
	
}
