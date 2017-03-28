/*Restrictions for static method

There are two main restrictions for the static method. They are:
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context. 
 */
package oops;

public class Static4 {
	
		static int a=40;//non static  
		// without static we will get compiletime error
		   
		 public static void main(String args[]){  
		  System.out.println(a);  
		 }  
		}        


