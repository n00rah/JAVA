package exceptionhandling;

public class NullpointerEx {
public void show()
{
	try
	{
		String s=null;
		System.out.println(s.length());		
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
		System.out.println("NULL POINTER EXCEPTION");
	}
	finally
	{
		System.out.println("FINALLY BLOCK");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullpointerEx obj=new NullpointerEx();
		obj.show();
	}

}
