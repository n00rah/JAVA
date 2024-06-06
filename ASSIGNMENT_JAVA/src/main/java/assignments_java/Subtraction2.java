package assignments_java;

public class Subtraction2 extends Addition2{
public void meth2(int a,int b)
{
	super.meth2(20,7);
	int c=a-b;
	System.out.println("THE DIFFERENCE IS "+c);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction2 obj=new Subtraction2();
		obj.meth2(10,5);
	}

}