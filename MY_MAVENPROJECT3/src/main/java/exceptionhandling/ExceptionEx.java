package exceptionhandling;

public class ExceptionEx {
public void show()
{
	try
	{
		/*String s=null;
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.toUpperCase());*/
		
		int a=10/0;
		
		//int arr[]=new int[5];
		//arr[6]=4;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("ARITHMETIC EXCEPTION HANDLED");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println("ARRAY EXCEPTION HANDLED");
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
		System.out.println("NULL POINTER EXCEPTION HANDLED");
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
		System.out.println("NUMBER FORMAT EXCEPTION HANDLED");
	}
	finally
	{
		System.out.println("FINALLY BLOCK EXECUTED");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx obj=new ExceptionEx();
		obj.show();
	}

}
