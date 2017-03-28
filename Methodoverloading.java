/*If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 * There are two ways to overload the method in java

By changing number of arguments
By changing the data type


In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for calling methods.
 * 
 * 
 */
package oops;

public class Methodoverloading {
	
	
		static int add(int a,int b){return a+b;}  
		static int add(int a,int b,int c){return a+b+c;}  
		static double add(double a, double b){return a+b;}  
		}  
		  


