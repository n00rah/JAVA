package exceptionhandling;



public class Exceptionques {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try
		{
			int a=12/0;
			System.out.println(a);
			/*String s=null;
			System.out.println(s.length());*/
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
