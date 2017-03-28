package methodCalling;

public class Method1 {

	public int multiply(int a,int b,int c)
	{
		int result=a*b*c;
		return result;
	}
	public static void main(String[]args){
		
Method1 abc=new Method1();
int x=abc.multiply(10,20,30);
System.out.println(x);
}
}
