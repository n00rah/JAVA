package abstraction;

public class Newabstract2 extends Newabstract1{
void method1()
{
	System.out.println("SECOND");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newabstract1 obj=new Newabstract2();
		obj.method1();
		obj.method2();
	}

}
