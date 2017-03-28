/*Constructor in java is a special type of method that is used to initialize the object.

Java constructor is invoked at the time of object creation. 
It constructs the values i.e. provides data for the object 
 * A constructor that have no parameter is known as default constructor.
 
 * 
 */


package oops;


public class Defaultconstructor {
	 
/*	Defaultconstructor(){System.out.println("Bike is created");}  
		public static void main(String args[]){  
			Defaultconstructor b=new Defaultconstructor();  
		}  */
	
	int id;  
	String name;  
	  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
		Defaultconstructor s1=new Defaultconstructor();
		Defaultconstructor s2=new Defaultconstructor();
	s1.display();  
	s2.display();  
	}  
		
}
