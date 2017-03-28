package test;
import java.util.ArrayList;


public class Arraylyst {
	public static void main(String[]args){
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("ajeet");
		obj.add("harry");
		obj.add("steve");
		obj.add("anuj");
		
		System.out.println("currently the array list has following elements:" +obj );
		
		obj.add(0, "rahul");
		obj.add(1, "justin");
		
		
		obj.remove("ajeet");
		obj.remove("steve");
		
		System.out.println("current array list is:"+obj);
		
		obj.remove(1);
		
		System.out.println("current array list is:"+obj);
				
	}
	

}
