package methodCalling;

public class Method4 {
public static void studentrank(int marks){
	if(marks>=500){
		System.out.println("rank a");
	}
	else if(marks>=250){
		System.out.println("rank b");
	}
	else{
		System.out.println("rank c");
	}
}
	public static void main(String[] args) {
		studentrank(270);
		

	}

}
