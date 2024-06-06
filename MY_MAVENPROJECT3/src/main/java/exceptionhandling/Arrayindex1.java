package exceptionhandling;

public class Arrayindex1 {
public void show()
{
	try
	{
		int a[]=new int[5];
		a[8]=15;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);  
		System.out.println("ARRAY EXCEPTION HANDLED");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayindex1 obj=new Arrayindex1();
		obj.show();
		
	}

}
