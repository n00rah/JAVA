package methodoverriding;

public class Overriding2 extends Overriding1{
public void meth1()
{
	System.out.println("meth() METHOD OF CHILD CLASS");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 obj=new Overriding2();
		obj.meth1();
	}

}
