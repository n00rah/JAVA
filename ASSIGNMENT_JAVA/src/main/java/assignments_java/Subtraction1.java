package assignments_java;

public class Subtraction1 extends Addition1{
public void meth1()
{
	super.meth1();
	int a=10,b=5,c=a-b;
	System.out.println("THE DIFFERENCE IS "+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction1 obj=new Subtraction1();
		obj.meth1();
		
	}

}