package exceptionhandling;

public class Arithmeticexception {
	public void show()
	{
try
{
	int a=5/0;
}
catch(ArithmeticException e)
{
	System.out.println(e);
	System.out.println("EXCEPTION HANDLED");
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmeticexception obj=new Arithmeticexception();
		obj.show();
	}

}
