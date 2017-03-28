/*Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more 
 * object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.
 * 
 * 
 */
package oops;

public class Aggregation1 {
	String city,state,country;  
	  
	public Aggregation1(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  

}
