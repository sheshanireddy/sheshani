/*
 * 
 * 
 */
package oops;

public class Aggregation2 {
	int id;  
	String name;  
	static Aggregation1 Aggregation1;  
	  
	public Aggregation2(int id, String name,Aggregation1 address) {  
	    this.id = id;  
	    this.name = name;  
	    this.Aggregation1=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(Aggregation1.city+" "+Aggregation1.state+" "+Aggregation1.country);  
	}  
	  
	public static void main(String[] args) {  
		Aggregation1 address1=new Aggregation1("gzb","UP","india");  
		Aggregation1 address2=new Aggregation1("gno","UP","india");  
	  
		Aggregation2 e=new Aggregation2(111,"varun",address1);  
		Aggregation2 e2=new Aggregation2(112,"arun",address2);  
	      
	e.display();  
	e2.display();  
	      
	}  
	

}
