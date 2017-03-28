/*Suppose there are 500 students in my college, now all instance data
 *  members will get memory each time when object is created.All student
 *   have its unique rollno and name so instance data member
 *  is good.Here, college refers to the common property of all objects.
 *  If we make it static,this field will get memory only once.
 */
// Static Variable
package oops;

public class Static1 {
  
		   int rollno;  
		   String name;  
		   static String college ="ITS";  
		     
		   Static1(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
		 void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
			 Static1 s1 = new Static1(111,"Karan");  
			 Static1 s2 = new Static1(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		 }  
		}  
	


