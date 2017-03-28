package methodCalling;


public class Exemethod2 {
public int add(int a, int b, int c){
	int result=a+b+c;
	return result;
	
}
	public static void main(String[] args) {
		Exemethod2 obj1=new Exemethod2();
		int y=obj1.add(10,20,30);
		System.out.println(y);
		
		Exemethod obj2=new Exemethod();
		int x=obj2.multiply(10,20,30);
		System.out.println(x);

	}

}
