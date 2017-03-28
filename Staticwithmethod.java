/*Another example of static method that performs normal calculation 
 */
package oops;

public class Staticwithmethod {
	 
		  static int cube(int x){  
		  return x*x*x;  
		  }  
		  
		  public static void main(String args[]){  
		  int result=Staticwithmethod.cube(5);  
		  System.out.println(result);  
		  }  
		}  
