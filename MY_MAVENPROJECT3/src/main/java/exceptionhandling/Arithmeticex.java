package exceptionhandling;

public class Arithmeticex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
{
		
	int a=10/0;
	System.out.println(a);
}
catch(ArithmeticException e)
{
	System.out.println(e);
	System.out.println("EXCEPTION HANDLED");
		
}
		
	}

}
