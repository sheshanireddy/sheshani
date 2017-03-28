/*In this example, we are creating the two 
 * objects of Student class and initializing the value to these objects
 *  by invoking the insertRecord method.
 *  Here, we are displaying the state (data) of the objects by invoking the
 *   displayInformation() method.
 * 
 * 
 */

package oops;

public class Createobject5 {
	public static void main(String args[]){  
		Createobject s1=new Createobject();
			Createobject s2=new Createobject();
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		 }  
	
}
