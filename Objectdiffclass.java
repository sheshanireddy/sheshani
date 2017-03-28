/*In real time development, we create classes and use it from another class.
 *  It is a better approach than previous one. Let's see a simple example,
 *   where we are having main() method in another class.*/
package oops;

public class Objectdiffclass {
	
		 public static void main(String args[]){  
			 Createobject s1=new Createobject();//creating an object of Student  
			  System.out.println(s1.id);//accessing member through reference variable  
			  System.out.println(s1.name);   
		 }  
		}  

