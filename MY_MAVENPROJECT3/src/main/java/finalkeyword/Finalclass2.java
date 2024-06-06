package finalkeyword;

public class Finalclass2 extends Finalclass1{               //cannot extend final class
public void meth2()
{
	System.out.println("child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Finalclass2 obj=new Finalclass2();
	 	obj.meth1();
	 	obj.meth2();
	}

}
