/*The this() constructor call should be used to reuse the constructor from the constructor. 
 * It maintains the chain between the constructors i.e. 
 * it is used for constructor chaining. Let's see the example given 
 * below that displays the actual use of this keyword.
 * 
 * 
 */
package oops;

public class Thisconstructor {
	
		int rollno;  
		String name,course;  
		float fee;  
		Thisconstructor(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		}  
		Thisconstructor(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
		}  
		
