/*Anonymous simply means nameless. An object which has no reference
 *  is known as anonymous object. It can be used 
 *  at the time of object creation only.
 * 
 * If you have to use an object only once, anonymous object is a good approach.
 */
package oops;

public class Anonamasobject {
	 
		 void fact(int  n){  
		  int fact=1;  
		  for(int i=1;i<=n;i++){  
		   fact=fact*i;  //5*4*3*2*1
		  }  
		 System.out.println("factorial is "+fact);  
		}  
		public static void main(String args[]){  
		 new Anonamasobject().fact(5);//calling method with anonymous object  
		}  
		}  
	

