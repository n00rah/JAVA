package exceptionhandling;

public class ReviewExceptions {
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
		}
		finally
		{
			System.out.println("End of the program");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReviewExceptions obj=new ReviewExceptions();
		obj.show();
		
		

	}
}
