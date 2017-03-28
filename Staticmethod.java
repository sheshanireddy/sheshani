/*A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.
 */
package oops;

public class Staticmethod {
	
	  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	     static void change(){  
	     college = "BBDIT";  
	     }  
	  
	     Staticmethod(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    	Staticmethod.change();  
	  
	    	Staticmethod s1 = new Staticmethod (111,"Karan");  
	    	Staticmethod s2 = new Staticmethod (112,"Kamal");  
	    	Staticmethod s3 = new Staticmethod (113,"Kalyan");     
	      
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	

}
