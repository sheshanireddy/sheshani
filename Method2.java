package methodCalling;

public class Method2 {

	public static int multiply(int a, int b, int c)
	{
		int result=a*b*c;
		return result;
	}
	public static void main(String[]args){
		int x=multiply(10,20,30);
		System.out.println(x);
	}
}
