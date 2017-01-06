package exception;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
	System.out.println("plese enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try
	{
		System.out.println(a/b);
	}
	catch(ArithmeticException awe){
		
	
	System.out.println("please check the number");
	divide();
	
	
	
	
	}
finally{
	System.out.println("i am finally");
	}
}
	private static void divide() {
		// TODO Auto-generated method stub
		
	}



}
