/*Constructor overloading is a technique in Java in which a 
 * class can have any number of constructors that differ in parameter lists.
 * The compiler differentiates these
 *  constructors by taking into account the number of parameters in the list and their type.
 * 
 */
package oops;

public class Constructoroverloading { 
	    int id;  
	    String name;  
	    int age;  
	    Constructoroverloading(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Constructoroverloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	Constructoroverloading s1 = new Constructoroverloading(111,"Karan");  
	    	Constructoroverloading s2 = new Constructoroverloading(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
	

}
