package methodCalling;

public class Method3 {
	public void studentrank(int marks){
		if(marks>=600){
			System.out.println("rank a");
		}
		else if(marks>=500){
			System.out.println("rank b");
		}
		else{
			System.out.println("rank c");
		}
	}

	public static void main(String[] args) {
		Method3 obj=new Method3();
		obj.studentrank(400);

	}

}
