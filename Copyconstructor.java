/*There is no copy constructor in java.
 *  But, we can copy the values of one object to another like copy constructor in C++.
There are many ways to copy the values of one object into another in java. They are:
By constructor
By assigning the values of one object into another
By clone() method of Object class
In this example, we are going to copy the values of one object into another using java constructor.
 * 
 */

package oops;

public class Copyconstructor {
	
	// copying the values with constructor
	
	/*    int id;  
	    String name;  
	    Copyconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Copyconstructor(Copyconstructor s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Copyconstructor s1 = new Copyconstructor(111,"Karan");  
	    	Copyconstructor s2 = new Copyconstructor(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	} */ 

/* copying the values without constructor
We can copy the values of one object into another by assigning the objects 
values to another object. In this case, there is no need to create the constructor.	*/

  
    int id;  
    String name;  
    Copyconstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    Copyconstructor(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	Copyconstructor s1 = new Copyconstructor(111,"Karan");  
    	Copyconstructor s2 = new Copyconstructor();
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  

