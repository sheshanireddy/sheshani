/*
 * Parameterized constructor is used to provide different values to the distinct objects.
Example of parameterized constructor

In this example, we have created the constructor of Student class
 that have two parameters. We can have any number of parameters in the constructor.
 * 
 *  */

package oops;

public class Parameterizedconstructor {
	  
	    int id;  
	    String name;  
	      
	    Parameterizedconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Parameterizedconstructor s1 = new Parameterizedconstructor(111,"Karan");  
	    	Parameterizedconstructor s2 = new Parameterizedconstructor(222,"Aryan");  
	    s1.display();  
	    s2.display();  
	   }  
	}  
	

