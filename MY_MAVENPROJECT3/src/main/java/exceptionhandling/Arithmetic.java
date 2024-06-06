package exceptionhandling;

public class Arithmetic {
public void show()
{
	try
	{
		int a=10/2;                     //no exception
		System.out.println(a);
		System.out.println("NO NEED OF CATCH BLOCK EXECUTION");
	
	}
	catch(ArithmeticException e)              //no need to execute catch
	{
		System.out.println(e);
		System.out.println("CATCH BLOCK EXECUTED");
		}
	finally
	{
		System.out.println("FINALLY BLOCK EXECUTED");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=new Arithmetic();
		obj.show()	;}

}
