package finalkeyword;

public class Finalmethod2 extends Finalmethod1 {
public void meth1()       //final method cannot override
{
	System.out.println("MAVEN");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalmethod2 obj=new Finalmethod2();
	obj.meth1()	;
	//obj.meth2();
	}

}
